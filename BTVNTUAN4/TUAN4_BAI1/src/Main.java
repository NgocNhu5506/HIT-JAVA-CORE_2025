package BAI11;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Nguyen A", 2004, "Hanoi", 7.5, 8.0, 8.5, 2);
        students[1] = new Student("Tran B", 2003, "Hue", 6.5, 7.0, 7.5, 0);
        students[2] = new Student("Le C", 2005, "Danang", 8.0, 9.0, 9.5, 1);
        students[3] = new Student("Pham D", 2004, "Saigon", 5.0, 6.0, 6.5, 3);
        students[4] = new Student("Hoang E", 2002, "Can Tho", 9.0, 8.5, 9.0, 4);

        System.out.printf("%-10s %-6s %-12s %-10s %-10s %-12s %-10s %-12s\n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số tiết nghỉ");

        for (Student s : students) {
            System.out.printf("%-10s %-6d %-12s %-10.2f %-10.2f %-12.2f %-10.2f %-12d\n",
                    s.getName(), s.getAge(), s.getAddress(), s.getTx1(), s.getTx2(), s.getKthp(),
                    s.getGPA(), s.getAbsent());
        }
    }
}
