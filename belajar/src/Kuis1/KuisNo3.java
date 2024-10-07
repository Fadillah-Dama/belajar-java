package Kuis1;
import java.util.Scanner;
public class KuisNo3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jam saat ini: ");
        int jam_sekarang = input.nextInt();
        System.out.print("masukkan menit saat ini: ");
        int menit_sekarang = input.nextInt();
        System.out.println("jam saat ini : " + jam_sekarang + ":" + menit_sekarang + "\n");

        System.out.print("masukkan kuliah dalam menit: ");
        int menit_kuliah = input.nextInt();

        int menit_pulang = (menit_sekarang + (menit_kuliah%60))%60;
        int menit_tambahan = (menit_sekarang + (menit_kuliah%60))/60; // untuk nambah jam kalau menit udah 1 
        int jam_pulang = jam_sekarang + menit_tambahan + (menit_kuliah/60);

        System.out.println(menit_tambahan);
        System.out.println("waktu kepulangan anda selesai kuliah pada: "+ jam_pulang + ":" + menit_pulang);
       
       
    }
}
