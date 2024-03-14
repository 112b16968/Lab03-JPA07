import java.util.Scanner;

public class Lab03JPA07 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Input:");
            int m = inputScanner.nextInt();
            if (m == 999) {
                break;
            }
            int n = inputScanner.nextInt();
            int gcd = gcd(m, n); // 計算 m 和 n 的最大公因數
            System.out.println(gcd);
        }
        inputScanner.close();
    }

    // 輾轉相除法計算最大公因數
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

