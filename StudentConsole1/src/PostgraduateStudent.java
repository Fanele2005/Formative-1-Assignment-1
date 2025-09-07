public class PostgraduateStudent extends Student {
    public PostgraduateStudent(String name, int id, double[] grades) {
        super(name, id, grades);
    }

    @Override
    public boolean hasPassed() {
        // Postgraduates need a higher pass mark
        return calculateAverage() >= 60;
    }
}
