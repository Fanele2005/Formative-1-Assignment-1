public class ReportGenerator implements Reportable {
    @Override
    public void generateReport(Student[] students) {
        System.out.println("===== STUDENT REPORT =====");
        for (Student s : students) {
            System.out.println("ID: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.printf("Average: %.2f%n", s.calculateAverage());
            System.out.println("Status: " + (s.hasPassed() ? "PASS" : "FAIL"));
            System.out.println("--------------------------");
        }
    }
}
