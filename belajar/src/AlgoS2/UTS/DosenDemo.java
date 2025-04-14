package AlgoS2.UTS;
import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen listDosen = new DataDosen();

        Dosen ds1 = new Dosen("111", "Yanto", "Pria", 25);
        Dosen ds2 = new Dosen("222", "Yanti", "Wanita", 26);
        Dosen ds3 = new Dosen("333", "Joko", "Pria", 30);
        Dosen ds4 = new Dosen("444", "Salsa", "Wanita", 24);
        Dosen ds5 = new Dosen("555", "Sutris", "Pria", 40);

        listDosen.tambah(ds1);
        listDosen.tambah(ds2);
        listDosen.tambah(ds3);
        listDosen.tambah(ds4);
        listDosen.tambah(ds5);

        boolean isAscended = false;

        while (true) {
            System.out.println("PILIHAN MENU:");
            System.out.println("1. Tampil data");
            System.out.println("2. Urutkan dosen termuda-tertua (ascending)");
            System.out.println("3. Urutkan dosen tertua-termuda (descending)");
            System.out.println("4. Cari dosen dengan kode");
            System.out.println("5. Cari dosen dengan usia (harus ascending)");
            System.out.println("6. Exit");
            System.out.print("Pilih menu : ");
            int menu = sc.nextInt();

            if (menu == 1) {
                listDosen.tampilSemuaData();
            } else if (menu == 2) {
                listDosen.insertionSort();
                isAscended = true;
                System.out.println("Data telah diurutkan ascending, pilih 1 untuk menampilkan");
                System.out.println("--------------------------");
            } else if (menu == 3) {
                listDosen.selectionSort();
                isAscended = false;
                System.out.println("Data telah diurutkan descending, pilih 1 untuk menampilkan");
                System.out.println("--------------------------");
            } else if (menu == 4) {
                sc.nextLine();
                System.out.print("Masukkan kode yang dicari : ");
                String key = sc.nextLine();
                int posisi = listDosen.sequentialSearch(key); // posisi diambil dri fungsi sequentialSearch
                listDosen.tampilPosisiSearchKode(key, posisi);
                listDosen.tampilDataSearchKode(posisi);
            } else if (menu == 5 && isAscended == true) {
                System.out.print("Masukkan usia yang dicari : ");
                int key = sc.nextInt();
                int posisi = listDosen.binarySearch(key, 0, (listDosen.jumlahDosen() - 1));
                listDosen.tampilPosisiSearchUsia(key, posisi);
                listDosen.tampilDataSearchUsia(posisi);
            } else if (menu == 5) {
                System.out.println("Harap lakukan sorting ascending terlebih dahulu!");
            } else if (menu == 6) {
                System.out.println("Program dihentikan");
                break;
            } else {
                System.out.println("Menu Invalid, masukkan menu ulang!");
            }
        }
    }
}
