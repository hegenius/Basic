import TodoItem from "./TodoItem.jsx";

function TodoBoard(props) {
    return (
        <div>
            <h1 className="mt-5 mb-3">Todo List</h1>
            {props.todoList.map((item) => <TodoItem item={item}/>)}
        </div>
    );
}
export default TodoBoard;