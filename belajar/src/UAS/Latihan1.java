import java.util.Scanner;

public class Latihan1 {

    static void inputData(String[] namaItem, int [] hargaItem, int[] jumlahItem) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== INPUT DATA ====");
        for (int i = 0; i < jumlahItem.length; i++) {
            System.out.print("Nama barang ke-" + (i + 1) + ": ");
            namaItem[i] = sc.nextLine();
            System.out.print("Harga barang ke-" + (i + 1) + ": ");
            hargaItem[i] = sc.nextInt();
            System.out.print("Jumlah barang ke-" + (i + 1) + ": ");
            jumlahItem[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    static int totalHarga(int hargaItem, int jumlahItem) {
        return hargaItem * jumlahItem;
    }

    static double diskon(int totalHarga) {
        if (totalHarga > 500000) {
            return 0.1;
        } else if (totalHarga > 300000) {
            return 0.05;
        } else {
            return 0;
        }
    }
    
    static void tampilData(String[] namaItem, int[] hargaItem, int[] jumlahItem) {
  
        System.out.println("==== DATA INVENTORI BARANG ====");
        System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s %-14s\n",
                        "No", "Nama item", "Harga ", "Jumlah", "Total Harga", "Diskon", "Harga Akhir");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < jumlahItem.length; i++) {
            int totalHarga = totalHarga(hargaItem[i], jumlahItem[i]);
            int diskon = (int) (totalHarga * diskon(totalHarga));
            int hargaAkhir = totalHarga - diskon;
            System.out.printf("%-14d %-13s %-13d %-13d %-13d %-13d %-13d\n", i + 1, namaItem[i], hargaItem[i], jumlahItem[i], totalHarga, diskon, hargaAkhir);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah item yang dibeli: ");
        int jumlahBarang = sc.nextInt();

        String[] namaItem = new String[jumlahBarang];
        int[] hargaItem = new int[jumlahBarang];
        int[] jumlahItem = new int[jumlahBarang];

        inputData(namaItem, hargaItem, jumlahItem);

        tampilData(namaItem, hargaItem, jumlahItem);

    }
}
