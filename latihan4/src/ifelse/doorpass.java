package ifelse;

import java.util.Scanner;

 public class doorpass{
    public static void main(String[] args) {
        
      int lock = 12345;
      Scanner scan = new Scanner(System.in);
      System.out.println("Masukkan sandi : ");

      int kode = scan.nextInt();

      if (kode == lock) {
         System.out.println("PASSWORD BENAR");
      } else {
         System.out.println("PASSWORD SALAH");
      }

    }
 }