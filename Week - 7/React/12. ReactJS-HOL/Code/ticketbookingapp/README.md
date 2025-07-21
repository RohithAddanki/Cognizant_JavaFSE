# Ticket Booking App - React Conditional Rendering Example

## Overview

This React application demonstrates **conditional rendering** using class components. It simulates a simple ticket booking system where:

- **Guest users** can view flight details but cannot book tickets.
- **Logged-in users** can book tickets via an interactive button.

The app also illustrates event handling, state management, and component communication in React.

---

## Objectives

- Understand conditional rendering in React.
- Learn how to use element variables for rendering different components conditionally.
- Implement event handlers for user interaction.
- Manage component state for login/logout behavior.
- Prevent unnecessary component rendering by controlling what is shown based on state.

---

## Features

- **Login Button:** When clicked, logs the user in and shows the User page.
- **Logout Button:** When clicked, logs the user out and shows the Guest page.
- **Guest Page:** Displays flight details visible to all visitors.
- **User Page:** Allows the logged-in user to book tickets.
- **Book Ticket Button:** Alerts a confirmation message upon clicking.

---

## Prerequisites

- Node.js and npm installed on your machine.
- Visual Studio Code or any preferred code editor.
- Basic knowledge of React components and JavaScript.

---

## Setup and Running the App

1. **Create React Application**

   Open a terminal or command prompt and run:

   ```bash
   npx create-react-app ticketbookingapp
    ```

2. **Navigate to Project Folder**
    ```
    cd ticketbookingapp
    ```

3. **Replace App.js Code**

    Open src/App.js in your editor and replace its content with the provided React code for conditional rendering (Login, Logout, GuestPage, UserPage, etc.).

4. **Start the Development Server**

    Run the following command in the project directory:
    ```
    npm start
    ```
    Access the App by opening your browser and navigate to:
    ```
    http://localhost:3000
    ```

## Author
>Rohith Addanki