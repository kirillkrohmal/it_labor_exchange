import React from "react";
import { Link } from "react-router-dom";
import "./NavBar.css"

export default function Home (props) {
    
    return (
        <header>
            <span class="logo">hh.ru</span>
            <nav>
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/admin">Admin</Link>
                    </li>
                    <li>
                        <Link to="/resume">Resume</Link>
                    </li>
                    <li>
                        <span><a href="mailto:email@hh.ru">email@hh.ru</a></span>
                    </li>
                </ul>
            </nav>
        </header>
    )
}

/* import React from "react";
import { BrowserRouter, Route, Link } from "react-router-dom";

function Navbar() {
  return (
    <nav>
      <ul>
        <li>
          <Link to="/">Home</Link>
        </li>
        <li>
          <Link to="/blogs">Blogs</Link>
        </li>
        <li>
          <Link to="/contact">Contact</Link>
        </li>
      </ul>
    </nav>
  );
}
*/
