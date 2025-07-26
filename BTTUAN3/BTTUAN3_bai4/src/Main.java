//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {


    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();

        int sumOdd = 0;

        System.out.print("Dãy Fibonacci từ 0 đến " + n + ": ");
        for (int i = 0; i <= n; i++) {
            int fi = fibonacci(i);
            System.out.print(fi + " ");
            if (fi % 2 != 0) {
                sumOdd += fi;
            }
        }

        
        System.out.println("\nTổng các số Fibonacci lẻ: " + sumOdd);

        scanner.close();
    }
}