export function TodoStats({ todos }) {
  const completedCount = todos.filter((t) => t.completed).length;

  return (
    <div className="mt-6 pt-4 border-t border-gray-200">
      <p className="text-gray-600 text-sm" data-cy="todo-count">
        Total: {todos.length} | Completed: {completedCount}
      </p>
    </div>
  );
}
