package logicoperator;

import java.util.Scanner;

public class logical{
    public static void main(String[] args) {
        
        System.out.println("SYSTEM IZIN MENAIKI WAHANA BERDASARKAN UMUR");
      
        Scanner scan = new Scanner(System.in);

        int umurpenumpang = scan.nextInt();

        if (umurpenumpang > 8 && umurpenumpang < 60) {
            System.out.println("ANDA DIPERBOLEHKAN NAIK");
        } else {
            System.out.println("ANDA TIDAK DIPERBOLEHKAN NAIK");
        }


        //length() untuk meghitung banyak karakter string, spasi dihitung
        String nama = "fadillah dama rifky";
        System.out.println("panjang karakternya adalah "+ nama.length());
    }
}

