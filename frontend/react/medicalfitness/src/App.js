import React from 'react';
import Signup from './components/Signup';
import './App.css';

const App = () => {
  return (
    <div className="app-container">
      <h1>Health Tracking App</h1>
      <Signup />
    </div>
  );
};

export default App;