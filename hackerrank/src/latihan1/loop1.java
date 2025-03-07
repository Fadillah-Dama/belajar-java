package latihan1;
import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input N : ");
        int N = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            int result = N * (i+1);
            System.out.println(N + " x " + (i+1) + " = "+ result);
        }
    }
}
