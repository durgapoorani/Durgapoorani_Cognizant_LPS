public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(1, "Alice", "Manager", 70000));
        manager.addEmployee(new Employee(2, "Bob", "Developer", 50000));
        manager.addEmployee(new Employee(3, "Charlie", "Analyst", 45000));

        manager.displayAllEmployees();

        System.out.println("\nSearching for employee with ID 2:");
        Employee result = manager.searchEmployee(2);
        System.out.println(result != null ? result : "Not found");

        System.out.println("\nDeleting employee with ID 2:");
        manager.deleteEmployee(2);

        manager.displayAllEmployees();
    }
}
