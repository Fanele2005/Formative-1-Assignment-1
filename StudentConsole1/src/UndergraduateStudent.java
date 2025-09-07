public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name, int id, double[] grades) {
        super(name, id, grades);
    }

    @Override
    public boolean hasPassed() {
        // Undergraduates pass if average >= 50
        return calculateAverage() >= 50;
    }
}


