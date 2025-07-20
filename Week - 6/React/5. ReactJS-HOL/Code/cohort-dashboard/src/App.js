import React from 'react';
import './App.css';
import CohortDetails from './Components/CohortDetails';

function App() {
  return (
    <div className="App">
      <h1>Cohorts Details</h1>

      <CohortDetails
        id="INTADMDFIO"
        stream=".NET FSD"
        startDate="22-Feb-2022"
        status="Scheduled"
        coach="Aathma"
        trainer="Jojo Jose"
      />

      <CohortDetails
        id="ADM21JF014"
        stream="Java FSD"
        startDate="10-Sep-2021"
        status="Ongoing"
        coach="Apoorv"
        trainer="Ehsa Smith"
      />

      <CohortDetails
        id="CDBJF21025"
        stream="Java FSD"
        startDate="8-Dec-2021"
        status="Ongoing"
        coach="Aathma"
        trainer="John Doe"
      />
    </div>
  );
}

export default App;