package Kuis1Nyoba;

import java.util.Scanner;

public class kuis1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tanggal berangkat : ");
        int tanggalBerangkat = sc.nextInt();
        System.out.print("Masukkan bulan berngkat: ");
        int bulanBerangkat = sc.nextInt();
        System.out.print("Masukkan tahun berangkat: ");
        int tahunBerangkat = sc.nextInt();
        System.out
                .println("Anda berangkat pada : " + tanggalBerangkat + " - " + bulanBerangkat + " - " + tahunBerangkat);

        System.out.println("Masukkan lama hari anda SE: ");
        int lamaHari = sc.nextInt();

        // 20 2 2020
        // 370

        int jumlahHariBerangkat = tahunBerangkat * 360 + (bulanBerangkat + 1) * 30 + tanggalBerangkat;
        int jumlahHariPulang = jumlahHariBerangkat + lamaHari;

        int tanggalPulang = ((jumlahHariPulang - 1) % 30) + 1;
        int bulanTambahan = ((tanggalPulang + tanggalBerangkat) / 30);
        int tahunPulang = jumlahHariPulang / 360;
        int bulanPulang = (((jumlahHariPulang + bulanTambahan + 1) % 360 - 1) / 30) - 1;

        System.out.println(tanggalPulang + " - " + bulanTambahan + " - " + tahunPulang);
        System.out.println(tanggalPulang + " - " + bulanPulang + " - " + tahunPulang);
        sc.close();
    }
}
