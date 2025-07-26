//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine().trim();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println(input.toUpperCase());
            System.out.println("Chuỗi này đối xứng.");
        } else {
            System.out.println(input.toLowerCase());
            System.out.println("Chuỗi này không đối xứng.");
        }

        scanner.close();
    }
}