package LatihanOop1;
import java.util.Scanner;

class kendaraan {
    static Scanner sc = new Scanner(System.in);
    String nomorPlat;
    String jenis;
    String waktuMasuk;
   
    public kendaraan() {

    }

    public kendaraan(String nomorPlat, String jenis, String waktuMasuk) {
        this.nomorPlat = nomorPlat;
        this.jenis = jenis;
        this.waktuMasuk = waktuMasuk;
    }

    public void tambahKendaraan(kendaraan[][] arrayOfKendaraan, int lantai, int slot) {

        if(arrayOfKendaraan[lantai-1][slot-1] == null) {
            System.out.print("Nomor plat: ");
            nomorPlat = sc.nextLine();
            System.out.print("Jenis kendaraan: ");
            jenis = sc.nextLine();
            System.out.print("Waktu masuk: ");
            waktuMasuk = sc.nextLine();

            arrayOfKendaraan[lantai-1][slot-1] = new kendaraan(nomorPlat, jenis, waktuMasuk);
            System.out.println("Kendaraan berhasil diparkir di lantai "+ lantai + " slot " + slot );
        } else {
            System.out.println("Tempat telah terisi!");
        }
    }

    public void display(kendaraan[][] arrayOfKendaraan) {
        for (int i = 0; i < arrayOfKendaraan.length; i++) {
            System.out.println("Lantai " + (i + 1));
            for (int j = 0; j < arrayOfKendaraan[i].length; j++) {
               if (arrayOfKendaraan[i][j] == null) {
                System.out.println("- Slot "+(j+1) + ": KOSONG");
               } else {
                System.out.println("- Slot "+(j+1) + ": "+ arrayOfKendaraan[i][j].nomorPlat + " | " +
                arrayOfKendaraan[i][j].jenis + " | "+ arrayOfKendaraan[i][j].waktuMasuk);
               }

            }
        }
    }

    public void hapusKendaraan(kendaraan[][] arrayOfKendaraan, int lantaiHapus, int slotHapus) {
        arrayOfKendaraan[lantaiHapus-1][slotHapus-1] = null;
    }


}

public class parkir {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int lantai, slot, menu, lantaiHapus, slotHapus;
        
        kendaraan[][] arrayOfKendaraan = new kendaraan[3][5];
        kendaraan k = new kendaraan();

        while (true) { 
            System.out.println("1. Input parkir kendaraan");
            System.out.println("2. Display parkir");
            System.out.println("3. Hapus kendaraan");
            System.out.print("Masukkan menu: ");
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.print("Anda ingin parkir di lantai: ");
                lantai = sc.nextInt();
                System.out.print("Anda ingin parkir di slot: ");
                slot = sc.nextInt();
                k.tambahKendaraan(arrayOfKendaraan, lantai, slot);
            } else if (menu == 2) {
                k.display(arrayOfKendaraan);
            } else if (menu == 3) {
                System.out.print("Kendaraan yang dihapus di lantai: ");
                lantaiHapus = sc.nextInt();
                System.out.print("Kendaraan yang dihapus di slot: ");
                slotHapus = sc.nextInt();
                k.hapusKendaraan(arrayOfKendaraan, lantaiHapus, slotHapus);
            } else if (menu == 4) {
                System.out.println("PROGRAM DIHENTIKAN");
                break;
            } else {
                System.out.println("MENU TIDAK TERSEDIA");
            }

        }
        
    }
}
