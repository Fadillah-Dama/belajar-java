package PersiapanKuis1S2;
import java.util.Scanner;

public class Mahasiswa {
    static Scanner sc = new Scanner(System.in);
    String nim;
    String nama;
    String jurusan;
    int tahunMasuk;

    public Mahasiswa() {

    }

    public Mahasiswa(String nim, String nama, String jurusan, int tahunMasuk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.tahunMasuk = tahunMasuk;

    }

    public void inputData() {
        System.out.print("Masukkan NIM Mahasiswa: ");
        this.nim = sc.nextLine();
        System.out.print("Masukkan nama Mahasiswa: ");
        this.nama = sc.nextLine();
        System.out.print("Masukkan jurusan Mahasiswa: ");
        this.jurusan = sc.nextLine();
        System.out.print("Masukkan tahun masuk Mahasiswa: ");
        this.tahunMasuk = sc.nextInt();
        sc.nextLine();
        System.out.println("-----------------------------------");
    }

    public void tampilData() {
        System.out.println("NIM         : " + this.nim);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Jurusan     : " + this.jurusan);
        System.out.println("Tahun masuk : " + this.tahunMasuk);
        System.out.println("-----------------------------------");
    }

    public Mahasiswa cariDenganNim(Mahasiswa[] arrayOfMahasiswa, String key) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nim = key;

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            if (mahasiswa.nim.equals(arrayOfMahasiswa[i].nim)) {
                mahasiswa = arrayOfMahasiswa[i];
            }
        }
        return mahasiswa;
    }

    public void hapusData(Mahasiswa[] arrayOfMahasiswa, String key) {
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            if (key.equals(arrayOfMahasiswa[i].nim)) {
                arrayOfMahasiswa[i] = null;
            }
        }
    }
}
