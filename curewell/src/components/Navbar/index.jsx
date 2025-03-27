import React from "react";
import "./Navbar.css"; // Importing the CSS file
import {Link , Routes, Route} from "react-router-dom"
const Navbar = () => {
  return (
    <nav className="navbar">
      <div className="navbar-container">
        <h1 className="navbar-title">CureWell</h1>
        <ul className="navbar-links">
          <li>
            <Link to="/viewDoctor">View Doctors</Link>
          </li>
          <li>
            <Link to="/specialization">View Specializations</Link>
          </li>
          <li>
            <Link to="/todaySergion">View Today's Surgery</Link>
          </li>
          <li>
            <Link to="/addDoctor">Add Doctor</Link>
          </li>
        </ul>
      </div>
    </nav>
  );
};

export default Navbar;
