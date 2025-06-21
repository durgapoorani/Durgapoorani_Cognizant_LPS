public class TaskDemo {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(101, "Design UI", "Pending"));
        manager.addTask(new Task(102, "Write Backend", "In Progress"));
        manager.addTask(new Task(103, "Testing", "Pending"));

        manager.displayTasks();

        System.out.println("\nSearching for Task ID 102:");
        Task result = manager.searchTask(102);
        System.out.println(result != null ? result : "Not Found");

        System.out.println("\nDeleting Task ID 102:");
        manager.deleteTask(102);

        manager.displayTasks();
    }
}
