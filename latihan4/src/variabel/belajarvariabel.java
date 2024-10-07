package variabel;

import java.util.Scanner;

public class belajarvariabel {
    public static void main(String[] args) {
        
        //percobaan 1
        String hobi = "bermain bola voli";
        boolean kepintaran = true;
        char kelamin = 'L';
        byte umurSaya = 18;
        double $ipk = 4.0, tinggi = 1.73;

        System.out.println("hobi saya adalah"+ hobi);
        System.out.println("apakah saya pintar : "+ kepintaran);
        System.out.println("jenis kelamin saya : "+ kelamin);
        System.out.println("umur saya adalah "+ umurSaya+ " tahun");
        System.out.println("ipk saya adalah "+ $ipk);
        System.out.println("tinggi saya "+ tinggi+ " m");


        //percobaan 4
        Scanner scan = new Scanner(System.in);

        // deklarasi variabel
        int a, t;
        float luas;

        //mengambil input
        System.out.println("Masukkan panjang alas : ");
        a = scan.nextInt();
        System.out.println("Masukkan tinggi segitiga : ");
        t = scan.nextInt();

        //perhitungan
        luas = (a*t)/2;

        // out hasil
        System.out.println("Luas garasi : "+ luas);

    }
}
