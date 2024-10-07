package com.lat1;

// impor library scan 
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hallo bro");
        System.out.println("Nama saya Dama");
       
    // deklarasi variabel
        String nama, jurusan;
        int umur;
        Double ipk;

    // membuat scanner baru

        Scanner keyboard = new Scanner(System.in);

     System.out.println("Nama mahasiswa :");
     nama = keyboard.nextLine();
     System.out.println("Jurusan :");
     jurusan = keyboard.nextLine();
     System.out.println("Umur :");
     umur = keyboard.nextInt();
     System.out.println(" Masukkan ipk anda : ");
     ipk = keyboard.nextDouble();


     // menampilkan apa yang sudah disimpan di variabel

     System.out.println("<-------------------->");
     System.out.println("Nama mahasiswa : "+ nama);
     System.out.println("Jurusan : "+ jurusan);
     System.out.println("Umur : "+ umur + " tahun");
     System.out.println("IPK anda adalah : "+ ipk);

    }
}