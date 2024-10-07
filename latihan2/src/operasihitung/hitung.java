package operasihitung;

// import library scanner
import java.util.Scanner;

public class hitung {
    public static void main(String[] args) {
        System.out.println("<------------>");
        System.out.println(" Sistem Menghitung luas lingkaran");
        System.out.println("<------------>");

        //deklarasi variabel hasil, r, Pi
        Double hasil, pi;
        int r;
        pi = 3.14;

        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //mengambil input jari jari(r) dari user
        System.out.println("Berapa jari jari lingkarannya : ");
        r = keyboard.nextInt();

        //operasi hitung luas lingkaran
        hasil = pi * r * r;

        //menampilkan hasil 
        System.out.println("Jadi luas lingkarannya = "+ hasil);
    }
}