package PersiapanKuis1S2;
import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int banyakMahasiswa = sc.nextInt();

        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[banyakMahasiswa]; 

        // input
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-"+ (i+1));
            arrayOfMahasiswa[i] = new Mahasiswa();
            arrayOfMahasiswa[i].inputData();
        }


        // tampil data
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayOfMahasiswa[i].tampilData();
        }

        // cari mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        sc.nextLine();
        System.out.print("Masukkan NIM yang dicari: ");
        String key = sc.nextLine();
        System.out.println("Mahasiswa dengan NIM tersebut adalah : ");
        mahasiswa.cariDenganNim(arrayOfMahasiswa, key).tampilData();

        // hapus data
        System.out.print("Masukkan NIM yang ingin dihapus: ");
        key = sc.nextLine();
        mahasiswa.hapusData(arrayOfMahasiswa, key);
        System.out.println("Mahasiswa tersebut berhasil dihapus");

        for (int i = 0; i < (arrayOfMahasiswa.length-1); i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayOfMahasiswa[i].tampilData();
        }

    }
}
