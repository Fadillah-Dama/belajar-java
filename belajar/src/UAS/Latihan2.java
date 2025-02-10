import java.util.Scanner;

public class Latihan2 {

    static void inputData(int[][] arrNilai, Scanner sc) {
        System.out.println("===== INPUT DATA =====");
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+ (i+1) + " : ");
            for (int j = 0; j < arrNilai[i].length; j++) {
                System.out.print("Nilai matkul ke-"+ (j+1)+ " : ");
                arrNilai[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    static int[] hitungTotalNilai(int[][] arrNilai, int jumlahMahasiswa, int jumlahMatkul ) {
        int[] totalNilai = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahMatkul; j++) {
                totalNilai[i] += arrNilai[i][j];
            }
        }
        return totalNilai;
    }

    static double[] rataNilai(int[] totalNilai, int jumlahMahasiswa, int jumlahMatkul) {
        double[] rata = new double[jumlahMahasiswa];

        for (int i = 0; i < rata.length; i++) {
           rata[i] = (double ) (totalNilai[i] / jumlahMatkul);
        }
        return rata;
    }

    static void tampilData(int[][] arrNilai, int[] totalNilai, double[] rata) {

        System.out.println("==== DATA INVENTORI BARANG ====");
    System.out.printf("%-6s %-18s %-14s %-14s\n",
                    "No", "Nilai", "Total Nilai", "Rata-Rata");
    System.out.println("-----------------------------------------------------------------");

    for (int i = 0; i < arrNilai.length; i++) {
        System.out.printf("%-6d", (i + 1)); // Kolom No dengan lebar 6 karakter

        // Menampilkan nilai-nilai dalam array arrNilai[i]
        for (int j = 0; j < arrNilai[i].length; j++) {
            System.out.printf("%-4d", arrNilai[i][j]); // Menampilkan nilai dengan lebar 4 karakter
        }

        // Menampilkan total nilai dan rata-rata
        System.out.printf("\t  %-11d    %-16f\n", totalNilai[i], rata[i]);
    }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahMatkul = sc.nextInt();

        int[][] arrNilai = new int[jumlahMahasiswa][jumlahMatkul];
        int[] totalNilai ;
        double[] rata;

        inputData(arrNilai, sc);

        totalNilai = hitungTotalNilai(arrNilai, jumlahMahasiswa, jumlahMatkul);
        rata = rataNilai(totalNilai, jumlahMahasiswa, jumlahMatkul);

        tampilData(arrNilai, totalNilai, rata);

    }
}
