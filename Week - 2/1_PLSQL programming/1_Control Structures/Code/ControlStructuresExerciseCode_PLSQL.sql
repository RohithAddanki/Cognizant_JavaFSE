--CONTROL STRUCTURES
-- Drop tables if exist
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Loans CASCADE CONSTRAINTS';
EXCEPTION
  WHEN OTHERS THEN
    IF SQLCODE != -942 THEN -- ORA-00942: table or view does not exist
      RAISE;
    END IF;
END;
/

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Customers CASCADE CONSTRAINTS';
EXCEPTION
  WHEN OTHERS THEN
    IF SQLCODE != -942 THEN
      RAISE;
    END IF;
END;
/

-- Create tables
CREATE TABLE Customers (
  CustomerID NUMBER PRIMARY KEY,
  Name VARCHAR2(100),
  Age NUMBER,
  Balance NUMBER,
  IsVIP CHAR(1) DEFAULT 'N'
);

CREATE TABLE Loans (
  LoanID NUMBER PRIMARY KEY,
  CustomerID NUMBER REFERENCES Customers(CustomerID),
  InterestRate NUMBER,
  DueDate DATE
);

-- Insert sample data
INSERT INTO Customers VALUES (1, 'Rohit Sharma', 65, 15000, 'N');
INSERT INTO Customers VALUES (2, 'Virat Kohli', 45, 8000, 'N');
INSERT INTO Customers VALUES (3, 'MS Dhoni', 61, 12000, 'N');
INSERT INTO Customers VALUES (4, 'Hardik Pandya', 30, 20000, 'N');

INSERT INTO Loans VALUES (101, 1, 10.5, SYSDATE + 15);
INSERT INTO Loans VALUES (102, 2, 11.0, SYSDATE + 40);
INSERT INTO Loans VALUES (103, 3, 12.0, SYSDATE + 5);
INSERT INTO Loans VALUES (104, 4, 9.5, SYSDATE + 60);

COMMIT;

-- Scenario 1: Discount interest for customers above 60
BEGIN
  FOR rec IN (SELECT l.LoanID, l.InterestRate 
              FROM Loans l JOIN Customers c ON l.CustomerID = c.CustomerID
              WHERE c.Age > 60)
  LOOP
    UPDATE Loans
    SET InterestRate = InterestRate - 1
    WHERE LoanID = rec.LoanID;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 2: Set VIP flag for customers with balance > 10,000
BEGIN
  FOR rec IN (SELECT CustomerID, Balance FROM Customers WHERE Balance > 10000)
  LOOP
    UPDATE Customers
    SET IsVIP = 'Y'
    WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 3: Reminder messages for loans due within next 30 days
DECLARE
  CURSOR loan_cursor IS
    SELECT c.Name, l.DueDate
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
  FOR rec IN loan_cursor LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan due for ' || rec.Name || ' on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;
/


-- To check if VIP flags updated or interest rates changed
SELECT * FROM Customers;
SELECT * FROM Loans;
