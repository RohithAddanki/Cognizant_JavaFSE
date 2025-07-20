import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore 
        name="Aarav Mehta" 
        school="Delhi Public School, Ahmedabad" 
        total={478}  
      />
      
    </div>
  );
}

export default App;
