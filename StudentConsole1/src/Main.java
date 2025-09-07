public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3]; // Array of objects

        students[0] = new UndergraduateStudent("Fanele", 101, new double[]{65, 70, 80});
        students[1] = new UndergraduateStudent("Cebo", 102, new double[]{40, 55, 50});
        students[2] = new PostgraduateStudent("Syanda", 201, new double[]{60, 65, 70});

        Reportable reportGen = new ReportGenerator();
        reportGen.generateReport(students);
    }
}
