package looping;

import java.util.Scanner;

public class P7_Flow2DoWhile {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double jam, gajiAkhir;
        int gajiHarian, pegawai = 1;

        do {
            System.out.println("masukkan jam kerja pegawai ke-" + pegawai + " : ");
            jam = scan.nextDouble();
            System.out.println("Masukkan gaji harian pegawai "+ pegawai +" : ");
            gajiHarian = scan.nextInt();
            
            if (jam > 8) {
                gajiAkhir = gajiHarian + (gajiHarian * 0.20 );
                System.out.println("Pegawai mendapat bonus sebesr 20%");
                System.out.println("gaji pegawai ke-" + pegawai + " = " + gajiAkhir);
            } else if (jam >= 0) {
                gajiAkhir =  gajiHarian;
                System.out.println("gaji pegawai ke-" + pegawai + " = " + gajiAkhir);
            } else {
                System.out.println("PROGRAM BERHENTI");
            }
            pegawai++;
        } while (jam >= 0);
        
        System.out.println("SELESAI");

        scan.close();
    }
}
