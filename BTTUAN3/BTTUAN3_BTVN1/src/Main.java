//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String SQUARE = "Square";
        final String TRIANGLE = "Triangle";
        final String CIRCLE = "Circle";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập loại hình (Square, Triangle, Circle): ");
        String type = scanner.nextLine().trim();

        double area = 0;

        if (type.equalsIgnoreCase(SQUARE)) {
            System.out.print("Nhập cạnh hình vuông: ");
            double side = scanner.nextDouble();
            area = side * side;

        } else if (type.equalsIgnoreCase(TRIANGLE)) {
            System.out.print("Nhập đáy tam giác: ");
            double base = scanner.nextDouble();
            System.out.print("Nhập chiều cao tam giác: ");
            double height = scanner.nextDouble();
            area = 0.5 * base * height;

        } else if (type.equalsIgnoreCase(CIRCLE)) {
            System.out.print("Nhập bán kính hình tròn: ");
            double r = scanner.nextDouble();
            final double PI = 3.14159265;
            area = PI * r * r;

        } else {
            System.out.println("Hình dạng không hợp lệ!");
            scanner.close();
            return;
        }

        System.out.printf("Diện tích viên gạch là: %.4f\n", area);
        scanner.close();
    }
}