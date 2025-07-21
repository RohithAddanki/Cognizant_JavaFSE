# Exercise: Currency Convertor React Application

## Overview

This React application demonstrates the implementation of event handling and form management in React class components. It includes:

- A simple counter with increment and decrement buttons.
- Buttons that trigger alerts and synthetic events.
- A **Currency Convertor** component that converts amounts from Indian Rupees (INR) to multiple foreign currencies.
- Usage of React events, state management, controlled components, and basic styling.

---

## Objectives

- Understand React event handling and binding of event handlers.
- Learn to use the `this` keyword correctly within class components.
- Handle synthetic events in React.
- Implement form input controls with controlled components.
- Use conditional rendering to display conversion results.
- Apply inline styles and associate labels with form inputs.
- Manage component state and update UI dynamically.

---

## Features of the Currency Convertor Component

- Green heading titled **"Currency Convertor"**.
- Input box to enter amount in INR with a placeholder and label.
- Dropdown selection for target currency with label, including:
  - Euro (EUR)
  - US Dollar (USD)
  - British Pound (GBP)
  - Australian Dollar (AUD)
  - Canadian Dollar (CAD)
  - Japanese Yen (JPY)
- Validates the input to ensure a positive number.
- Converts the INR amount to selected currency using predefined exchange rates.
- Displays the converted amount below the form.

---

## Prerequisites

Before starting, ensure you have the following installed on your machine:

- [Node.js](https://nodejs.org/) (which includes npm)
- [npm](https://www.npmjs.com/)
- [Visual Studio Code](https://code.visualstudio.com/) or any code editor of your choice

---

## Setup and Installation

### 1. Create React App

Open your terminal or command prompt and run:

```bash
npx create-react-app currencyconvertor
```
This command creates a new React project named currencyconvertor with all necessary configurations.



### 2. Navigate to Project Directory
```
cd currencyconvertor
```


### 3. Create Components Folder and CurrencyConvertor Component

- Inside the src folder, create a new folder named components. Then inside components, create a file CurrencyConvertor.js.

- Paste the CurrencyConvertor component code (as described in the project) into CurrencyConvertor.js.


### 4. Update App.js
- Modify src/App.js to include the event handling features and import the CurrencyConvertor component.


### 5. Run the Application
In the project directory, run:
```
npm start
```
This starts the React development server. Open your browser and navigate to:
```
http://localhost:3000
```

## 🧑‍💻 Author
> Rohith Addanki