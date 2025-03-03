package PersiapanKuis2;

import java.util.Scanner;

public class PersiapanKuis2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[][] kursi = new String[5][8];
        int pilihan, nomorBaris, nomorKursi, kursiDiPesan = 0;

        while(true){
            for (int i = 0; i < kursi.length; i++) {
                for (int j = 0; j < kursi[i].length; j++) {
                    if (kursi[i][j] == null) {
                        kursi[i][j] = "O";
                    }
                    System.out.print(kursi[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.println("\nPilihan Menu");
            System.out.println("1. Pesan Kursi");
            System.out.println("2. Keluar");
            System.out.print("Menu yang dipilih : ");
            pilihan = sc.nextInt();
            sc.nextLine();

                if (pilihan == 1) {
                    while(true) {
                        System.out.print("Masukkan nomor baris : ");
                        nomorBaris = sc.nextInt();
                        System.out.print("Masukkan nomor kursi : ");
                        nomorKursi = sc.nextInt();

                        if (kursi[nomorBaris-1][nomorKursi-1].equals("X")) {
                            System.out.println("Kursi sudah dipesan, silahkan pilih kursi lain");
                            continue;
                        } else {
                            kursi[nomorBaris-1][nomorKursi-1] = "X";
                            System.out.println("Kursi Berhasil disimpan");
                            kursiDiPesan++;
                            break;
                        }
                    }
                    System.out.println("================================");
                    System.out.println("Kursi yang dipesan : "+ kursiDiPesan);
                    System.out.println("Kursi yang tersedia : "+ (40 - kursiDiPesan));


                } else {
                    System.out.println("PROGRAM BERHENTI");
                    break;

                }
    
        }
        sc.close();
    }
}
