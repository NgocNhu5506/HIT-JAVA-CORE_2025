//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();

        System.out.print("Nhập tuổi của bạn: ");
        int tuoi = scanner.nextInt();

        System.out.print("Nhập chiều cao của bạn (cm): ");
        double chieuCao = scanner.nextDouble();


        System.out.println("\n--- Thông tin cá nhân ---");
        System.out.println("Họ và tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chiều cao: " + chieuCao + " cm");

        scanner.close();
    }
    }
