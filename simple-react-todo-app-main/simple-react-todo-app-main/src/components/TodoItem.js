export function TodoItem({ todo, onToggle, onDelete }) {
  return (
    <div
      className="flex items-center gap-3 p-3 bg-gray-50 rounded-md hover:bg-gray-100"
      data-cy="todo-item"
    >
      <input
        type="checkbox"
        checked={todo.completed}
        onChange={() => onToggle(todo.id)}
        className="w-5 h-5 cursor-pointer"
        data-cy="todo-checkbox"
      />
      <span
        className={`flex-1 ${
          todo.completed ? "line-through text-gray-500" : "text-gray-800"
        }`}
        data-cy="todo-text"
      >
        {todo.text}
      </span>
      <button
        onClick={() => onDelete(todo.id)}
        className="px-3 py-1 bg-red-500 text-white rounded-md hover:bg-red-600 text-sm"
        data-cy="delete-button"
      >
        Delete
      </button>
    </div>
  );
}
