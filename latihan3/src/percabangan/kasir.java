package percabangan;

import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        System.out.println("DISKON");
        
        String kartu;
        int belanjaan, hargaakhir, diskon, a; 
       
        Scanner scan = new Scanner(System.in);
        System.out.println("apakah memiliki kartu ya/tidak : ");
        kartu = scan.nextLine();
        System.out.println("berapa total belanjaan anda : ");
        belanjaan = scan.nextInt();
        
       

        if (kartu.equalsIgnoreCase("ya")) {
            if (belanjaan > 100000) {
                diskon = 5;
                a = diskon;
            } else if (belanjaan > 500000) {
                diskon = 10;
                a = diskon;
            } else if (belanjaan > 800000) {
                diskon = 20;
                a = diskon;
            } else {
                diskon = 0;
                a = diskon;
            }
            hargaakhir = belanjaan - (belanjaan * a/100);
            System.out.println("jadi harga barang belanjaan : "+ hargaakhir);

        } else {
            System.out.println("mohon maaf anda tidak memiliki kartu");
        }

       System.out.println("TERIMAKASIH TELAH BERBELANJA");

       


    }
}
