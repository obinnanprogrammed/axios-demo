import { useState } from 'react'
import './App.css'

function App() {
  // TODO: Add event handling to get message from backend when button is clicked
  const [name, setName] = useState("");
  
  return (
    <>
      <div className="card">
        <form>
          <p>Enter your name:</p>
          <input type="text" onChange={(e) => setName(e.target.value)}></input>
          {/* TODO: Alter button so that it will retrieve message from backend on click */}
          <input type="submit" value="Submit"></input>
        </form>
        <div>
          {/* TODO: here the message received from the backend will go here. */}
        </div>
      </div>
    </>
  )
}

export default App
