function TodoItem(props) {
    return (
        <div className="todo-item">
            <span className="material-symbols-outlined">check_circle</span>
            {props.item}
        </div>
    );
}

export default TodoItem;