package percabangan;

import java.util.Scanner;

public class percabanganif {
    
    public static void main(String[] args) {

        System.out.println("menghitung harga setelah dipotong diskon untuk barang diatas Rp 100.000");

        //membuat scan
        Scanner scan = new Scanner(System.in);

        //deklarasi variabel
        int harga, diskon, a, total;

        //input persen diskon yang berlaku
        System.out.println("berapa % diskonnya : ");
        diskon = scan.nextInt();
        a = diskon;

        //harga asli barang 
        System.out.println("harga asli barang : ");
        harga = scan.nextInt();

        //perhitungan dengan percabangan if
        if (harga >= 100000) {
            total = harga - (harga * a/100);
            System.out.println("jadi harga akhir barang : "+ total);
        } else {
            System.out.println("anda tidak mendapatkan diskon");
        }

        System.out.println("terimakasih telah belanja");
    }
}
