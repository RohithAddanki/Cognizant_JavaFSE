# Exercise: 🏏 CricketApp – React + ES6 Features Practice

This is a React-based project built to demonstrate key ES6 features through a real-world themed application: **Cricket Player Management**.

The application conditionally displays either:
- A list of players and scores (with filtering), or
- Indian team details (with odd/even separation and merging arrays), depending on a boolean `flag`.

---

## 🎯 Objectives

- Demonstrate **ES6 features** in a React project
  - `map()` method
  - Arrow functions (`=>`)
  - Array destructuring
  - Spread operator (`...`)
  - `let`, `const`
  - Conditional rendering in React

---

## 🧰 Prerequisites

Before running this project, ensure the following are installed:

- ✅ [Node.js](https://nodejs.org/)
- ✅ npm (comes with Node.js)
- ✅ [Visual Studio Code](https://code.visualstudio.com/)

---

## 🚀 Getting Started

### 1️. Create the React App

```bash
npx create-react-app cricketapp
```
### 2. Navigate to the project directory:
```
cd cricketapp
```

### 3. Create Folder and Files
Inside src/, create:
```
src/
├── components/
│   ├── ListofPlayers.js
│   └── IndianPlayers.js
```

### 4. 📦 Components Overview
#### 🔹 ListofPlayers.js
- Renders a list of 11 players using map()

- Filters players with score < 70 using arrow functions

> Exports:

- ListofPlayers

- Scorebelow70

#### 🔹 IndianPlayers.js
- Accepts an array IndianTeam = [ 'Sachin1', 'Rohit2', 'Virat3', ... ]

> Displays:

- Odd indexed players (1st, 3rd, 5th)

- Even indexed players (2nd, 4th, 6th)

- Merges two arrays (T20 and Ranji players) using spread operator

>Exports:

- OddPlayers
- EvenPlayers
- ListofIndianPlayers


#### 🔹 App.js
- Declares a boolean flag = true or false

- Conditionally renders:

>When flag = true:
```
Displays player list and scores less than 70
```
> When flag = false:
```
Displays Indian team (odd/even) and merged list
```

### 5. 🖥️ Run the Application
In terminal:
```
npm start
```
Visit in browser:
```
http://localhost:3000
```

## Author
Rohith Addanki