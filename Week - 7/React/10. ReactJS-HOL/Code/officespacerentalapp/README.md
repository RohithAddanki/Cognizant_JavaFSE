# 🏢 OfficeSpaceRentalApp

**OfficeSpaceRentalApp** is a simple React-based application that showcases how to use **JSX syntax**, **JavaScript expressions**, **inline styling**, and **dynamic data rendering** to create an office rental listing interface.

---

## 🎯 Objectives

This lab exercise helps learners:

- Understand how to use JSX in React applications
- Learn how to apply inline CSS styles in JSX
- Dynamically render HTML elements using JavaScript arrays
- Use JavaScript expressions within JSX for conditional rendering
- Structure components using best practices for clarity and maintainability

---

## 📚 Key Concepts Covered

- **JSX (JavaScript XML):** Syntax extension that allows mixing HTML with JavaScript.
- **ECMAScript (ES6):** Used for modern JavaScript features like arrow functions, object destructuring, etc.
- **React.createElement():** Behind-the-scenes method used by JSX to create React elements.
- **Rendering JSX to the DOM:** Integrating React elements into the actual HTML output.
- **JavaScript expressions in JSX:** Embedding dynamic values and conditions directly in HTML-like syntax.
- **Inline CSS:** Applying style objects directly in JSX using the `style` attribute.
- **Conditional Styling:** Applying different styles (e.g., text color) based on logical conditions (e.g., rent amount).

---

## 🧰 Prerequisites

Ensure the following tools are installed on your system:

- ✅ Node.js (v18 or above recommended)
- ✅ npm (comes bundled with Node.js)
- ✅ Visual Studio Code (or any code editor)

---

## 🏗️ Project Setup Instructions

Follow these steps to build and run the **OfficeSpaceRentalApp**:

### 1. Create the React Application

Use the `create-react-app` CLI tool to scaffold the project.

```
npx create-react-app officespacerentalapp
```


### 2. Navigate to the Project Directory
```
cd officespacerentalapp
```

### 4. Replace the App Content
- Open the src/App.js file.

- Replace the default content with JSX that:

- Displays a heading using JSX.

- Shows multiple office space listings with:

- Name, Rent, Address.

- A unique image for each location.

- Conditional styling: rent in red if ≤ ₹60,000, green if above.

### 5. Start the React Application
Run the following command to launch the development server:
```
npm start
```
### 6. View the Output
Once the app builds successfully, your default browser should open automatically. If not, visit:
```
http://localhost:3000
```


## Author
>Rohith Addanki