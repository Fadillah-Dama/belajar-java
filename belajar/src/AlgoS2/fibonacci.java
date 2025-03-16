package AlgoS2;
import java.util.Scanner;

public class fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int fibonacciBF(int n) {
        int a = 0;
        int b = 1;
        int c;
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci keberapa: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci ke-"+ n + " DC : "+fibonacci(n));
        System.out.println("FIbonacci ke-"+ n + " BF : "+fibonacciBF(n));
    }
}
