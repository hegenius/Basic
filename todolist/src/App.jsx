import {useState} from "react";
import './App.css'
import TodoBoard from "./components/TodoBoard.jsx";

function App() {
    const [inputValue, setInputValue] = useState(' ')
    const [todoList, setTodoList] = useState([])
    const addItem = () => {
        setTodoList([...todoList, inputValue])
    }

  return (
        <div className="container mt-5">
            <div className="innerWrap">
                <div className="input-group mb-3">
                    <input type="text" value={inputValue}  className="form-control" placeholder="Recipient's username"
                           aria-label="Recipient's username" aria-describedby="button-addon2" onChange={(event) => setInputValue(event.target.value)}/>
                    <button className="btn btn-dark" type="button" id="button-addon2" onClick={addItem}>추가</button>
                </div>
                <TodoBoard todoList={todoList}/>
            </div>
        </div>
  );
}

export default App
