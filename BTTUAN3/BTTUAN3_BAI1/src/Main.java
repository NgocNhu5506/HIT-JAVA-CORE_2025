//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        import java.util.Scanner;

        public class Main  {

            // Hàm kiểm tra số nguyên tố
            public static boolean isPrime(int n) { // dung method kiểm tra số nguyên tố
                if (n < 2) return false;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) return false;
                }
                return true;
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in); // Tạo một đối tượng scanner để đọc dữ liệu nhập từ bàn phím.

                // Nhập số phần tử
                System.out.print("Nhập số phần tử của mảng: ");
                int n = scanner.nextInt(); // Nhập số lượng phần tử của mảng và lưu vào biến n

                int[] arr = new int[n]; //Tạo mảng số nguyên arr gồm n phần tử (tất cả ban đầu = 0)

                // Nhập các phần tử
                System.out.println("Nhập các phần tử:");
                for (int i = 0; i < n; i++) {
                    System.out.print("Phần tử thứ " + (i + 1) + ": ");
                    arr[i] = scanner.nextInt();// tao mang de chua n so nguyen
                }

                int sumEven = 0; /*sumEven: lưu tổng số chẵn.

                sumOdd: lưu tổng số lẻ.

                countPrime: đếm số lượng số nguyên tố.*/
                int sumOdd = 0;
                int countPrime = 0;

                // Xử lý mảng
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0) {
                        sumEven += arr[i];// Nếu chẵn thì cộng vào sumEven
                    } else {
                        sumOdd += arr[i];// neu le thi cong vao sumOdd
                    }

                    if (isPrime(arr[i])) {
                        countPrime++; // neu le thi cong vao countPrime
                    }
                }

                // In kết quả
                System.out.println("Tổng các số chẵn: " + sumEven);
                System.out.println("Tổng các số lẻ: " + sumOdd);
                System.out.println("Số lượng số nguyên tố: " + countPrime);

                scanner.close();
            }
        }
