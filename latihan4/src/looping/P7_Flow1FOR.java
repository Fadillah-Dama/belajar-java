package looping;
 import java.util.Scanner;

public class P7_Flow1FOR {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int jamBelajar, totalJamBelajar = 0;

        for (int hari = 1; hari <= 7; hari++) {

            System.out.println("Hari ke-" + hari);
            System.out.print("masukkan lama belajar: ");
            jamBelajar = input.nextInt();
            if (jamBelajar > 10 || jamBelajar < 0) {
                System.out.println("TIDAK MUNGKIN, Masukkan jam ulang !");
                continue;
            }
            if (jamBelajar <= 10) {
                totalJamBelajar += jamBelajar;
            } else {
                System.out.print("masukkan lama belajar ulang: ");
                jamBelajar = input.nextInt();
                totalJamBelajar += jamBelajar;
            }

        }

        System.out.println("Total jam belajar: " + totalJamBelajar);

        input.close();
    }
}
