public class Student {
    private String name;
    private int id;
    private double[] grades; // Advanced array usage

    public Student(String name, int id, double[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double[] getGrades() { return grades; }

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public boolean hasPassed() {
        return calculateAverage() >= 50;
    }
}
