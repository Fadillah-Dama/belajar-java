package looping;

import java.util.Scanner;

public class P7_Flow1While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jamBelajar, totalJamBelajar = 0, hari =1;

        while (hari <= 7) {
            System.out.println("Hari ke-" + hari);
            System.out.print("masukkan lama belajar: ");
            jamBelajar = input.nextInt();
            if (jamBelajar > 10 || jamBelajar < 0) {
                System.out.println("TIDAK MUNGKIN, Masukkan jam ulang !");
                continue;
            }
            totalJamBelajar += jamBelajar;
           hari ++;
        }

        System.out.println("Total jam belajar minggu ini: " + totalJamBelajar + " jam");

        input.close();
    }
}
