//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int a = rand.nextInt(101);
        int b = rand.nextInt(101);
        boolean correct = rand.nextBoolean();

        int realSum = a + b;
        int c = correct ? realSum : rand.nextInt(201);

        // Nếu đang giả mạo sai mà ngẫu nhiên lại trúng đúng => đổi khác đi
        if (!correct && c == realSum) {
            c = (c + 1) % 201;
        }

        System.out.printf("Phép toán: %d + %d = %d\n", a, b, c);
        System.out.print("Phép tính đúng hay sai? (Nhập: đúng/sai): ");
        String answer = scanner.nextLine().trim();

        boolean userCorrect = answer.equalsIgnoreCase("đúng") && (c == realSum) ||
                answer.equalsIgnoreCase("sai") && (c != realSum);

        if (userCorrect) {
            System.out.println("Bạn đã trả lời ĐÚNG.");
        } else {
            System.out.println("Bạn đã trả lời SAI.");
        }

        scanner.close();
    }
}