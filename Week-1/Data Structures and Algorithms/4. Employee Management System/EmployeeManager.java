public class EmployeeManager {
    Employee[] employees;
    int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add employee
    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
            System.out.println("Employee added: " + emp.name);
        } else {
            System.out.println("Employee list is full.");
        }
    }

    // Search employee by ID
    public Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse all employees
    public void displayAllEmployees() {
        System.out.println("\n--- All Employees ---");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID
    public void deleteEmployee(int id) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int j = index; j < size - 1; j++) {
                employees[j] = employees[j + 1];
            }
            employees[--size] = null;
            System.out.println("Employee with ID " + id + " deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
