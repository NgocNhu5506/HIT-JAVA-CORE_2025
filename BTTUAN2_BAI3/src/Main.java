//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Lần " + i + ":");

            System.out.print("Nhập số nguyên thứ nhất: ");
            int so1 = scanner.nextInt();

            System.out.print("Nhập số nguyên thứ hai: ");
            int so2 = scanner.nextInt();

            int tong = so1 + so2;
            int hieu = so1 - so2;
            int tich = so1 * so2;
            int thuong = (so2 != 0) ? (so1 / so2) : 0;
            int du = (so2 != 0) ? (so1 % so2) : 0;

            System.out.println("Tổng: " + tong);
            System.out.println("Hiệu: " + hieu);
            System.out.println("Tích: " + tich);
            if (so2 != 0) {
                System.out.println("Thương: " + thuong);
                System.out.println("Chia lấy dư: " + du);
            } else {
                System.out.println("Không thể chia cho 0");
            }

            if (so1 == so2) {
                System.out.println("Hai số bằng nhau.");
            } else {
                System.out.println("Hai số không bằng nhau.");
            }

            System.out.println("--------------------------");
        }

        scanner.close();
    }
    }
