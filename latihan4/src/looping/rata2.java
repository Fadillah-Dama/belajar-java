package looping;

import java.util.Scanner;

public class rata2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int nilai, matkul = 5, total = 0;
         double rata2;

         for (int i = 0; i < matkul; i++) {
            nilai = input.nextInt();

            total += nilai;
         }

         rata2 = total / matkul;

         System.out.println(rata2);
    }
}
