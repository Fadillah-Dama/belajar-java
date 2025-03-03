package PersiapanKuis2;
import java.util.Scanner;
public class PersiapanKuis3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] harga = {
            {50000, 70000, 100000},
            {150000, 200000, 250000},
            {300000, 400000, 500000},
            {200000, 250000, 300000}
        };

        System.out.print("Masukkan banyak kategori yang dibeli : ");
        int kategori = sc.nextInt();

        int[][] jumlahBeli = new int [4][3];

        for (int i = 0; i < kategori; i++) {
            System.out.println("Kategori ke-"+ (i+1));
            for (int j = 0; j < jumlahBeli[i].length; j++) {
                System.out.print("Produk ke-"+ (j+1) + " : ");
                jumlahBeli[i][j] = sc.nextInt();
            }
        }

        int totalNotDiskon = 0;
        for (int i = 0; i < kategori; i++) {
            int totalPerKatergori = 0;
            for (int j = 0; j < jumlahBeli[i].length; j++) {
                int hargaProduk = jumlahBeli[i][j] * harga[i][j];
                totalPerKatergori += hargaProduk;   
            }
            totalNotDiskon += totalPerKatergori;
        }

        // diskon
        double hargaDiskon;
        double diskon;
        if (totalNotDiskon > 1000000) {
            diskon = 0.2 * totalNotDiskon;
        } else if (totalNotDiskon >= 500000 && totalNotDiskon <= 1000000) {
            diskon = 0.1 * totalNotDiskon;
        } else {
            diskon = 0;
        }

        hargaDiskon = totalNotDiskon - diskon;
        
        // output
        System.out.println("=====================");
        System.out.println("total: "+ totalNotDiskon);
        System.out.println("Diskon : " + diskon);
        System.out.println("harga setelah diskon : "+ hargaDiskon);


    }
}
