//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] dsSinhVien = new Student[n];


        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin sinh viên thứ " + (i + 1) + ":");

            System.out.print("Tên: ");
            String name = scanner.nextLine();

            System.out.print("Tuổi: ");
            int age = scanner.nextInt();

            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            dsSinhVien[i] = new Student(name, age, gpa);
        }


        System.out.println("\n--- Danh sách sinh viên ---");
        for (Student sv : dsSinhVien) {
            sv.display();
        }

        double tongGPA = 0;
        for (Student sv : dsSinhVien) {
            tongGPA += sv.gpa;
        }
        double diemTB = tongGPA / n;
        System.out.println("\nĐiểm trung bình của cả lớp: " + diemTB);

        Student svMax = dsSinhVien[0];
        for (int i = 1; i < n; i++) {
            if (dsSinhVien[i].gpa > svMax.gpa) {
                svMax = dsSinhVien[i];
            }
        }
        System.out.println("\nSinh viên có điểm cao nhất:");
        svMax.display();

        scanner.close();
    }
}
