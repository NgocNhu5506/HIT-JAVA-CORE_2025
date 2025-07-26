//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int value = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;


        while (value <= n * n) {
            for (int i = left; i <= right; i++) matrix[top][i] = value++;
            top++;
            for (int i = top; i <= bottom; i++) matrix[i][right] = value++;
            right--;
            for (int i = right; i >= left; i--) matrix[bottom][i] = value++;
            bottom--;
            for (int i = bottom; i >= top; i--) matrix[i][left] = value++;
            left++;
        }


        System.out.println("Ma trận xoắn ốc " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }


        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];               // Đường chéo chính
            sum += matrix[i][n - 1 - i];       // Đường chéo phụ
        }

        
        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2];
        }

        System.out.println("Tổng các phần tử trên 2 đường chéo: " + sum);

        scanner.close();
    }
}