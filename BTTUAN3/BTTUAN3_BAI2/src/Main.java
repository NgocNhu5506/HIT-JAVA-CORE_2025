//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                final double PI = 3.14159265;

                Scanner scanner = new Scanner(System.in);


                System.out.print("Nhập bán kính r (double): ");
                double r = scanner.nextDouble();

                System.out.print("Nhập số mũ k (int): ");
                int k = scanner.nextInt();


                double chuVi = 2 * PI * r;
                double dienTich = PI * r * r;

                double rMuK = Math.pow(r, k);


                double canBacHai = Math.sqrt(r + k);


                double giaTriTuyetDoi = Math.abs(r - k);


                System.out.printf("Chu vi hình tròn: %.4f\n", chuVi);
                System.out.printf("Diện tích hình tròn: %.4f\n", dienTich);
                System.out.printf("r^k = %.4f\n", rMuK);
                System.out.printf("Căn bậc hai của (r + k) = %.4f\n", canBacHai);
                System.out.printf("Giá trị tuyệt đối của (r - k) = %.4f\n", giaTriTuyetDoi);

                scanner.close();
            }
        }



