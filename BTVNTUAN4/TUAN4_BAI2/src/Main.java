//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package Student;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Student> danhSach = new ArrayList<>();

    public static void main(String[] args) {
        danhSach.add(new Student("Long", 2006, "Hà Nội", 8, 9, 8.5, 0));
        danhSach.add(new Student("Khánh", 2005, "Hà Nội", 8, 8, 8, 1));

        while (true) {
            System.out.println("\n------ Quản lý sinh viên ------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Sắp xếp theo tuổi");
            System.out.println("4. Sắp xếp theo GPA");
            System.out.println("5. Sắp xếp theo số tiết nghỉ");
            System.out.println("6. Xóa sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> themSinhVien();
                case 2 -> suaSinhVien();
                case 3 -> sapXepTheoTuoi();
                case 4 -> sapXepTheoGPA();
                case 5 -> sapXepTheoNghi();
                case 6 -> xoaSinhVien();
                case 0 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }

            inDanhSach();
        }
    }

    static void themSinhVien() {
        System.out.print("Tên: ");
        String ten = sc.nextLine();
        System.out.print("Năm sinh: ");
        int nam = sc.nextInt();
        sc.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.print("Điểm TX1: ");
        double tx1 = sc.nextDouble();
        System.out.print("Điểm TX2: ");
        double tx2 = sc.nextDouble();
        System.out.print("Điểm KTHP: ");
        double kt = sc.nextDouble();
        System.out.print("Số tiết nghỉ: ");
        int nghi = sc.nextInt();
        danhSach.add(new Student(ten, nam, diaChi, tx1, tx2, kt, nghi));
    }

    static void suaSinhVien() {
        System.out.print("Nhập vị trí sinh viên cần sửa (0..." + (danhSach.size() - 1) + "): ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index >= 0 && index < danhSach.size()) {
            System.out.print("Tên mới: ");
            String ten = sc.nextLine();
            System.out.print("Năm sinh mới: ");
            int nam = sc.nextInt(); sc.nextLine();
            System.out.print("Địa chỉ mới: ");
            String diaChi = sc.nextLine();
            System.out.print("TX1 mới: ");
            double tx1 = sc.nextDouble();
            System.out.print("TX2 mới: ");
            double tx2 = sc.nextDouble();
            System.out.print("KTHP mới: ");
            double kt = sc.nextDouble();
            System.out.print("Tiết nghỉ mới: ");
            int nghi = sc.nextInt();
            danhSach.set(index, new Student(ten, nam, diaChi, tx1, tx2, kt, nghi));
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }
    }

    static void sapXepTheoTuoi() {
        danhSach.sort(Comparator.comparing(Student::getTuoi));
    }

    static void sapXepTheoGPA() {
        danhSach.sort((a, b) -> Double.compare(b.getGPA(), a.getGPA()));
    }

    static void sapXepTheoNghi() {
        danhSach.sort(Comparator.comparing(Student::getRest));
    }

    static void xoaSinhVien() {
        System.out.print("Nhập vị trí sinh viên muốn xóa (0..." + (danhSach.size() - 1) + "): ");
        int index = sc.nextInt();
        if (index >= 0 && index < danhSach.size()) {
            danhSach.remove(index);
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }
    }

    static void inDanhSach() {
        System.out.printf("\n%-10s %-6s %-12s %-10s %-10s %-12s %-10s %-10s\n",
                "Tên", "Tuổi", "Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Nghỉ");
        for (Student s : danhSach) {
            System.out.printf("%-10s %-6d %-12s %-10.2f %-10.2f %-12.2f %-10.2f %-10d\n",
                    s.getName(), s.getTuoi(), s.getStress(), s.getTest1(), s.getTest2(), s.getTest3(),
                    s.getGPA(), s.getRest());
        }
    }
}