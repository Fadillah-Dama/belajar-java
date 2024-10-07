package operator;

import java.util.Scanner;

public class operasiaritmatika {

    public static void main(String[] args) {
      
     // deklarasi variabel 
        int angka1, angka2, hasil;

        Scanner keyboard = new Scanner(System.in);

    //penjumlahan
        System.out.println("operasi penjumlahan");
        System.out.println("input angka 1 = ");
        angka1 = keyboard.nextInt();
        System.out.println("input angka 2 = ");
        angka2 = keyboard.nextInt();
        //proses
        hasil = angka1 + angka2;
        //output
        System.out.println("hasilnya = "+ hasil);

    //operator sisa bagi
        System.out.println("operasi sisa bagi");
        System.out.println("input angka 1 = ");
        angka1 = keyboard.nextInt();
        System.out.println("input angka 2 = ");
        angka2 = keyboard.nextInt();
        //proses
        hasil = angka1 % angka2;
        //output
        System.out.println("hasilnya = "+ hasil);


    }
}
