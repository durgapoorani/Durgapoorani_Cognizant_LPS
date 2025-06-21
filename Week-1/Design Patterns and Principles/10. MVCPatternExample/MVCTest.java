public class MVCTest {
    public static void main(String[] args) {
        // Create model and view
        Student student = new Student("Durga", "ST102", "A");
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Initial display
        controller.updateView();

        System.out.println("\n-- Updating student information --\n");

        // Updated model using controller
        controller.setStudentName("Poorani");
        controller.setStudentGrade("A+");

        // Updated display
        controller.updateView();
    }
}
