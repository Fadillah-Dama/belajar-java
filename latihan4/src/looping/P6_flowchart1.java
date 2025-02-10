package looping;

import java.util.Scanner;   

public class P6_flowchart1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int jamBelajar, totalJamBelajar = 0, hari = 1;

        while (hari <= 7) {

            System.out.println("Hari ke-" + hari);
            System.out.print("Masukkan jam belajar: ");
            jamBelajar = input.nextInt();
            if (jamBelajar < 10) {
                totalJamBelajar += jamBelajar;
            } else {
                System.out.print("input jam belajar ulang: ");
                jamBelajar = input.nextInt();
                totalJamBelajar += jamBelajar;
            }
            hari++;
        }

        System.out.println("Total jam belajar: " + totalJamBelajar);

    }
}
