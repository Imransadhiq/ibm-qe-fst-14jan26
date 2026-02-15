import { useState } from "react";

export function TodoInput({ onAdd }) {
  const [input, setInput] = useState("");

  function handleAdd() {
    if (input.trim()) {
      onAdd(input);
      setInput("");
    }
  }

  function handleKeyPress(e) {
    if (e.key === "Enter") {
      handleAdd();
    }
  }

  return (
    <div className="flex gap-2 mb-6">
      <input
        type="text"
        value={input}
        onChange={(e) => setInput(e.target.value)}
        onKeyPress={handleKeyPress}
        placeholder="Enter a new todo..."
        className="flex-1 px-4 py-2 border border-gray-300 rounded-md focus:outline-none focus:ring-2 focus:ring-blue-500"
        data-cy="todo-input"
      />
      <button
        onClick={handleAdd}
        className="px-6 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-500"
        data-cy="add-button"
      >
        Add
      </button>
    </div>
  );
}
