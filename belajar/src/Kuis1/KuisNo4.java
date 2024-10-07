package Kuis1;
import java.util.Scanner;
public class KuisNo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jam saat ini: ");
        int jam_sekarang = input.nextInt();
        System.out.print("masukkan menit saat ini: ");
        int menit_sekarang = input.nextInt();
        System.out.println("jam saat ini : " + jam_sekarang + ":" + menit_sekarang);

        System.out.print("masukkan jam masuk kuliah: ");
        int jam_masuk = input.nextInt();
        System.out.print("masukkan menit masuk kuliah: ");
        int menit_masuk = input.nextInt();
        System.out.println("jam kuliah anda dimulai : " + jam_masuk + ":" + menit_masuk);

        int menit_luang = (jam_masuk * 60 + menit_masuk) - (jam_sekarang * 60 + menit_sekarang);
        
        int jam_sisa = menit_luang /60;
        int menit_sisa = (menit_luang - (jam_sisa * 60));

        System.out.println("sisa waktu menuju jam kuliah anda : " + jam_sisa + " jam " + menit_sisa + " menit");

    }
} 
