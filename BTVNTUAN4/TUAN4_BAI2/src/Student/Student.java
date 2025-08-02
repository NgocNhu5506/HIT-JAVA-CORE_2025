package Student;

public class Student {
    private String name;
    private int born;
    private String stress;
    private double test1, test2, test3;
    private int rest;

    public Student(String name, int born, String stress, double test1, double test2, double test3, int rest) {
        this.name = name;
        this.born = born;
        this.stress = stress;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        this.rest = rest;
    }

    public String getName() { return name; }
    public int getBorn() { return born; }
    public int getTuoi() { return java.time.Year.now().getValue() - born; }
    public String getStress() { return stress; }
    public double getTest1() { return test1; }
    public double getTest2() { return test2; }
    public double getTest3() { return test3; }
    public int getRest() { return rest; }

    public double getGPA() {
        return test1 * 0.2 + test2 * 0.3 + test3 * 0.5;
    }
}