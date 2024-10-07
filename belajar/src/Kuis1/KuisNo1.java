package Kuis1;

import java.util.Scanner;

public class KuisNo1 {
    public static void main(String[] args) {
        //deklarasi variabel
        Scanner input = new Scanner(System.in);
        int tanggal_berangkat, bulan_berangkat, tahun_berangkat, lama_pergi, tanggal_pulang, bulan_pulang, tahun_pulang ;

        System.out.print("Masukkan tanggal berangkat: ");
        tanggal_berangkat = input.nextInt();
        System.out.print("Masukkan bulan berangkat: ");
        bulan_berangkat = input.nextInt();
        System.out.print("Masukkan tahun berangkat: ");
        tahun_berangkat = input.nextInt();
        System.out.println("Tanggal berangkat: "+tanggal_berangkat+"-"+bulan_berangkat+"-"+tahun_berangkat+"\n");

        System.out.print("Lama hari anda student exchange: ");
        lama_pergi = input.nextInt();
        // 20 2 2020
        //370
        int tahun = lama_pergi/360; // 370/360 = 1
        int bulan = (lama_pergi%360)/30; // 0
        int hari = lama_pergi%30; // 10

        System.out.println(tahun+" tahun "+bulan+" bulan "+hari+" hari");

        tanggal_pulang = (tanggal_berangkat + hari-1)%30+1; // 20 + 10 = 0
       int tanggalTambahan = (tanggal_berangkat + hari-1)/30;  // 20 + 10 = 0
       bulan_pulang = (bulan_berangkat + bulan + tanggalTambahan-1)%12+1; // 2 + 0  + 0
       int bulanTambahan = (bulan_berangkat + bulan + tanggalTambahan-1)/12;

       tahun_pulang = (tahun_berangkat + tahun + bulanTambahan);

       System.out.println("tanggal pulang: "+tanggal_pulang);
       System.out.println("bulan pulang: "+bulan_pulang);
       System.out.println("tahun pulang: "+tahun_pulang);
    }
    
}
