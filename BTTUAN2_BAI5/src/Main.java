//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Bảng cửu chương của số 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        int tongChanFor = 0;
        for (int i = 2; i <= 100; i += 2) {
            tongChanFor += i;
        }
        System.out.println("\nTổng các số chẵn từ 1 đến 100: " + tongChanFor);

        int tongChanWhile = 0;
        int i = 2;
        while (i <= 100) {
            tongChanWhile += i;
            i += 2;
        }
        System.out.println("Tổng các số chẵn từ 1 đến 100: " + tongChanWhile);
    }
}
