package LatihanOop1;
import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    double[] nilai;

    public Mahasiswa(String nim, String nama, int jumlahMatkul) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = new double[jumlahMatkul];
    }

    public void displayInfo() {
        System.out.print("NIM: "+this.nim+" | Nama: " + this.nama + " | Nilai: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]+ " ");
        }
        System.out.println();
    }
}

class ManajemenNilai {
    static Scanner sc = new Scanner(System.in);
    Mahasiswa[][] kelas;
    int jumlahMahasiswa;
    int jumlahMatkul;
    
    public ManajemenNilai(int jumlahMahasiswa, int jumlahMatkul) {
        this.jumlahMahasiswa = jumlahMahasiswa;
        this.jumlahMatkul = jumlahMatkul;
        kelas = new Mahasiswa[jumlahMahasiswa][jumlahMatkul];
    }

    public void tambahMahasiswa() {
        for (int i = 0; i < kelas.length; i++) {
            System.out.print("Masukkan NIM Mahasiswa: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan nama Mahasiswa: ");
            String nama = sc.nextLine();
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, jumlahMatkul);

            for (int j = 0; j < kelas[i].length; j++) {
                System.out.print("Masukkan nilai ke-"+ (j+1)+ " : ");
                mahasiswa.nilai[j] = sc.nextDouble();
            }
            sc.nextLine();
            kelas[i][0] = mahasiswa;
        }
    }

    public void tampilSemuaMahasiswa() {
        for (int i = 0; i < kelas.length; i++) {
            if (kelas[i][0] != null) {
                kelas[i][0].displayInfo();
            } 
        }
    }

    public void cariMahasiswa(String nim)  {
        for (int i = 0; i < kelas.length; i++) {
            if (kelas[i][0].nim.equalsIgnoreCase(nim)) {
                kelas[i][0].displayInfo();
                break;
            } else {
                System.out.println("NIM TIDAK DITEMUKAN");
                break;
            }
        }
    }

    
}

public class MahasiswaDemo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Masukkan banyak Mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan banyak Mata Kuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine();

        ManajemenNilai manajemenNilai = new ManajemenNilai(jumlahMahasiswa, jumlahMatkul);

        while(true) {
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Semua Data Mahasiswa");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                manajemenNilai.tambahMahasiswa();
            } else if (menu == 2) {
                manajemenNilai.tampilSemuaMahasiswa();
            } else if (menu == 3) {
                System.out.print("Masukkan NIM yang ingin dicari: ");
                String nim = sc.nextLine();
                manajemenNilai.cariMahasiswa(nim);
            } else if (menu == 4 ) {
                System.out.println("PROGRAM DIHENTIKAN");
                break;
            }
        }
    }
    
}