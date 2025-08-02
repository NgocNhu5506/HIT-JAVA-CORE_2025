package BAI11;

import java.time.Year;

public class Student {
    private String name;
    private int birthYear;
    private String address;
    private double tx1;
    private double tx2;
    private double kthp;
    private int absent;

    public Student(String name, int birthYear, String address, double tx1, double tx2, double kthp, int absent) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.absent = absent;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public String getAddress() {
        return address;
    }

    public double getTx1() {
        return tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public int getAbsent() {
        return absent;
    }

    public double getGPA() {
        return tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
    }
}
