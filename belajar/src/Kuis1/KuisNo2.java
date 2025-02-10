package Kuis1;

import java.util.Scanner;

public class KuisNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan tanggal berangkat: ");
        int tanggal_berangkat09 = input.nextInt();
        System.out.print("masukkan bulan berangkat: ");
        int bulan_berangkat09 = input.nextInt();
        System.out.print("masukkan tahun berangkat: ");
        int tahun_berangkat09 = input.nextInt();
        System.out.print("Tanggal berangkat: "+tanggal_berangkat09+"-"+bulan_berangkat09+"-"+tahun_berangkat09+"\n");

        System.out.print("Masukkan tanggal pulang: ");
        int tanggal_pulang09 = input.nextInt();
        System.out.print("Masukkan bulan pulang: ");
        int bulan_pulang09 = input.nextInt();
        System.out.print("Masukkan tahun pulang: ");
        int tahun_pulang09 = input.nextInt();
        System.out.println("Tanggal kepulangan: "+tanggal_pulang09+"-"+bulan_pulang09+"-"+tahun_pulang09+"\n");

        int jumlahHariPulang = tahun_pulang09 * 360 + (bulan_pulang09 - 1) * 30 + tanggal_pulang09;
        int jumlahHariBerangkat = tahun_berangkat09 * 360 + (bulan_berangkat09 - 1) * 30 + tanggal_berangkat09;

        int jumlahHari = jumlahHariPulang - jumlahHariBerangkat;

        System.out.println("Anda pergi selama : " + jumlahHari + " hari");

        input.close();

    }
}
