import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const average = props.total / 5;

  return (
    <div className="score-card">
      <u><h2>Student Details:</h2></u>
      <p><strong>Name: </strong> {props.name}</p>
      <p><strong>School: </strong> {props.school}</p>
      <p><strong>Total Marks: </strong> {props.total}</p>
      <p className="average"><strong>Average: </strong> {average}</p>
    </div>
  );
}

export default CalculateScore;