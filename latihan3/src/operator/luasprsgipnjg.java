package operator;

import java.util.Scanner;

public class luasprsgipnjg {
    public static void main(String[] args) {
        
        System.out.println("menghitung luas dan keliling persegi panjang");
        
        //deklarasi variabel
        int panjang, lebar, hasil;

        //buat scanner baru
        Scanner keyboard = new Scanner(System.in);

        //input panjang dan lebarnya
        System.out.println("input panjang = ");
        panjang = keyboard.nextInt();
        System.out.println("input lebar = ");
        lebar = keyboard.nextInt();

        hasil = panjang * lebar;

        //output luas persegi panjang
        System.out.println("luasnya = "+ hasil);

        //hitung keliling persegi panjang
        hasil = (2 * panjang) + (2  *lebar);

        System.out.println("keliling persegi panjangnya = "+ hasil);

    }
    
}
