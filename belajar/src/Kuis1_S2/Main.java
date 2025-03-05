package Kuis1_S2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dama = new Scanner(System.in);
        
        Barang[] barangs = new Barang[4];

        barangs[0] = new Barang("Br01", "Bakso", "Makanan", 15, 5000);
        barangs[1] = new Barang("Br02", "Lalapan", "Makanan", 10, 12000);
        barangs[2] = new Barang("Br03", "Sate", "Makanan", 20, 10000);
        barangs[3] = new Barang("Br04", "Es teh", "Minuman", 40, 5000);

        
        Tranksaksi tranksaksi = new Tranksaksi();

        while (true) { 
            System.out.println("Menu: ");
            System.out.println("1. Tampil semua data");
            System.out.println("2. Hitung stock by jenis");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = dama.nextInt();
            dama.nextLine();

            if (menu == 1) {
                tranksaksi.tampilSemuaData(barangs);
            } else if (menu == 2) {
                System.out.println("Masukkan jenis: ");
                String key = dama.nextLine();
                tranksaksi.totalStockByJenis(barangs, key);
            } else if (menu == 3) {
                System.out.println("Program Berhenti");
                break;
            }
        }
    }
}
