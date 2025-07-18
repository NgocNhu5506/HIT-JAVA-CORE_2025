//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }


        System.out.print("Các phần tử vừa nhập: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();


        int tong = 0;
        for (int i = 0; i < 5; i++) {
            tong += mang[i];
        }
        System.out.println("Tổng các phần tử: " + tong);


        int max = mang[0];
        for (int i = 1; i < 5; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        System.out.println("Giá trị lớn nhất: " + max);

        scanner.close();
    }
}