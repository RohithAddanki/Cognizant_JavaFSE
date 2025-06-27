--STORED PROCEDURES
-- Drop tables if they exist (ignore errors if they don't)
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE SavingsAccounts CASCADE CONSTRAINTS';
EXCEPTION
  WHEN OTHERS THEN
    IF SQLCODE != -942 THEN -- table does not exist error
      RAISE;
    END IF;
END;
/

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Employees CASCADE CONSTRAINTS';
EXCEPTION
  WHEN OTHERS THEN
    IF SQLCODE != -942 THEN
      RAISE;
    END IF;
END;
/

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Accounts CASCADE CONSTRAINTS';
EXCEPTION
  WHEN OTHERS THEN
    IF SQLCODE != -942 THEN
      RAISE;
    END IF;
END;
/

-- Create tables
CREATE TABLE SavingsAccounts (
  AccountID NUMBER PRIMARY KEY,
  CustomerName VARCHAR2(100),
  Balance NUMBER
);

CREATE TABLE Employees (
  EmployeeID NUMBER PRIMARY KEY,
  EmployeeName VARCHAR2(100),
  Department VARCHAR2(50),
  Salary NUMBER
);

CREATE TABLE Accounts (
  AccountID NUMBER PRIMARY KEY,
  CustomerName VARCHAR2(100),
  Balance NUMBER
);

-- Insert sample data
INSERT INTO SavingsAccounts VALUES (1, 'Rohit Sharma', 10000);
INSERT INTO SavingsAccounts VALUES (2, 'Virat Kohli', 5000);
INSERT INTO SavingsAccounts VALUES (3, 'MS Dhoni', 15000);

INSERT INTO Employees VALUES (101, 'John Doe', 'Sales', 50000);
INSERT INTO Employees VALUES (102, 'Jane Smith', 'Sales', 60000);
INSERT INTO Employees VALUES (103, 'Alice Brown', 'HR', 55000);

INSERT INTO Accounts VALUES (201, 'Rohit Sharma', 10000);
INSERT INTO Accounts VALUES (202, 'Virat Kohli', 8000);

COMMIT;

-- Create stored procedures

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE SavingsAccounts
  SET Balance = Balance + (Balance * 0.01);
  COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  dept IN VARCHAR2,
  bonus_pct IN NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * (bonus_pct / 100))
  WHERE Department = dept;
  COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE TransferFunds (
  from_acc IN NUMBER,
  to_acc IN NUMBER,
  amount IN NUMBER
) AS
  source_balance NUMBER;
BEGIN
  SELECT Balance INTO source_balance FROM Accounts WHERE AccountID = from_acc;

  IF source_balance < amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
  ELSE
    UPDATE Accounts SET Balance = Balance - amount WHERE AccountID = from_acc;
    UPDATE Accounts SET Balance = Balance + amount WHERE AccountID = to_acc;
    COMMIT;
  END IF;
END;
/

-- Test the procedures
-- Run monthly interest processing
EXEC ProcessMonthlyInterest;

-- Check results
SELECT * FROM SavingsAccounts;

-- Update employee bonus by 10% for Sales department
EXEC UpdateEmployeeBonus('Sales', 10);

-- Check results
SELECT * FROM Employees;

-- Transfer 2000 from account 201 to 202
EXEC TransferFunds(201, 202, 2000);

-- Check account balances
SELECT * FROM Accounts;