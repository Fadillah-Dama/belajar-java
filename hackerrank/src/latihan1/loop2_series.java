package latihan1;
import java.util.Scanner;

public class loop2_series {
    
}

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int iterator = 1;
            
            for (int j = 0; j < n; j++) {
                System.out.print(a+(iterator*b) + " ");
                a = a + (iterator*b);
                if (j == 0) {
                    iterator++;
                } else {
                    iterator *= 2;
                }
            }
            System.out.println();
            
        }
        in.close();
    }
}
