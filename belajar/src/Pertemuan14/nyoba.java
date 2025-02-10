import java.util.Scanner;

public class nyoba {

    static void displayData(String stok[][]) {
        System.out.println("==== DATA INVENTORI BARANG ====");
        System.out.printf("%-14s %-14s %-14s %-15s\n", "No", "Nama item", "Kategori", "Stok");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                System.out.printf("%-15s", stok[i][j]);
            }
            System.out.println();
        }
    }

    static void tambahStok(String[][] stok, Scanner scanner) {
        displayData(stok);
        System.out.print("Masukkan nomor item untuk menambahkan stok: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        if (itemNo > 0 && itemNo <= stok.length) {
            System.out.print("Masukkan jumlah stok yang ingin ditambahkan: ");
            int jumlah = scanner.nextInt();
            if (jumlah > 0) {
                int currentStock = Integer.parseInt(stok[itemNo - 1][3]);
                stok[itemNo - 1][3] = String.valueOf(currentStock + jumlah);
                System.out.println("Stok " + stok[itemNo - 1][1] + " berhasil ditambahkan. Stok sekarang: " + stok[itemNo - 1][3]);
            } else {
                System.out.println("Jumlah stok harus lebih dari 0.");
            }
        } else {
            System.out.println("Item tidak ditemukan.");
        }
    }

    static String[][] tambahItemBaru(String[][] stok, Scanner scanner) {
        System.out.print("Masukkan nama item baru: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan kategori item baru: ");
        String category = scanner.nextLine();
        System.out.print("Masukkan jumlah stok awal: ");
        int stock = scanner.nextInt();

        if (stock > 0) {
            String[][] newStok = new String[stok.length + 1][4];
            for (int i = 0; i < stok.length; i++) {
                newStok[i] = stok[i];
            }
            newStok[stok.length] = new String[] { String.valueOf(stok.length + 1), name, category, String.valueOf(stock) };
            System.out.println("Item baru berhasil ditambahkan: " + name + " (" + category + ") - Stok: " + stock);
            return newStok;
        } else {
            System.out.println("Stok awal harus lebih dari 0.");
            return stok;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data awal
        String[][] stok = {
                {"1", "Kopi hitam", "Minuman", "10"},
                {"2", "Cappucino", "Minuman", "5"},
                {"3", "Teh tarik", "Minuman", "8"}
        };

        while (true) {
            System.out.println("\n===== MENU INVENTORI =====");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tambahkan Stok Item yang Ada");
            System.out.println("3. Tambahkan Item Baru");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (menu) {
                case 1:
                    displayData(stok);
                    break;
                case 2:
                    tambahStok(stok, scanner);
                    break;
                case 3:
                    stok = tambahItemBaru(stok, scanner);
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
