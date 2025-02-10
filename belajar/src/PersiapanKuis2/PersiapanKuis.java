package Pertemuan13;

import java.util.Scanner;

public class PersiapanKuis {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double arrNilai[][] = new double[5][4];

        System.out.println("===MASUKKAN NILAI===");

        for (int i = 0; i < arrNilai.length; i++) {
            double rataPerMahasiswa = 0;
            double totalPerMhasiswa = 0;
            System.out.println("Masukkan nilai mahasiswa ke-"+ (i+1)+ " : ");
            for (int j = 0; j < arrNilai[i].length; j++) {
                System.out.print("Masukkan Nilai Matkul ke-"+ (j+1)+ " : ");
                arrNilai[i][j] = sc.nextDouble();
                totalPerMhasiswa += arrNilai[i][j];
            }
            rataPerMahasiswa = totalPerMhasiswa / arrNilai[i].length;
            System.out.println("Rata rata mahasiswa ke-"+ (i+1)+ " : "+ rataPerMahasiswa);

        }

        System.out.println("===RATA RATA NILAI SETIAP MATKUL");

        for (int j = 0; j < 4; j++) {
            double totalPerMatkul = 0;
            double rataPerMatkul;
            for (int i = 0; i < arrNilai.length; i++) {
                totalPerMatkul += arrNilai[i][j];
            }
            rataPerMatkul = totalPerMatkul / arrNilai.length;
            System.out.println("Rata rata matkul ke-"+ (j+1)+ " : "+ rataPerMatkul);
        
        }

        System.out.println("===NILAI TERTINGGI/TERENDAH===");
        double tertinggi = 0, terendah = 100;
        for (int i = 0; i < arrNilai.length; i++) {
            for (int j = 0; j < arrNilai[i].length; j++) {
                if (arrNilai[i][j] > tertinggi) {
                    tertinggi = arrNilai[i][j];
                }
                if (arrNilai[i][j] < terendah){
                    terendah = arrNilai[i][j];
                }
            }
        }
        System.out.println("Nilai tertinggi : "+ tertinggi);
        System.out.println("Nilai terendah : "+ terendah);

        System.out.println("===KRITERIA KELULUSAN===");
        for (int i = 0; i < arrNilai.length; i++) {
            double totalPerMahasiswa2 = 0;
            double rataMahasiswa2;
            for (int j = 0; j < arrNilai[i].length; j++) {
                totalPerMahasiswa2 += arrNilai[i][j];
            }
            rataMahasiswa2 = totalPerMahasiswa2 / arrNilai[i].length;
            if (rataMahasiswa2 >= 60) {
                System.out.println("Mahasiswa "+ (i+1) +" : LULUS");
            } else {
                System.out.println("Mahasiswa "+ (i+1) +" : TIDAK LULUS");
            }
        }

        // display tabel
        System.out.println("===TABEL===\n");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-10s %-10s\n",
                "Mahasiswa", "Mata Kuliah 1", "Mata Kuliah 2", "Mata Kuliah 3", "Mata Kuliah 4", "Rata-rata", "Status");
        System.out.println("-------------------------------------------------------------------------------------------");

        String[] status = new String [arrNilai.length];
        double[] rataRataMahasiswa = new double[arrNilai.length];
        String[] mahasiswa = {"mahasiswa 1", "mahasiswa 2", "mahasiswa 3", "mahasiswa 4", "mahasiswa 5"};
        
        for (int i = 0; i < arrNilai.length; i++) {
            double total = 0;
            double rata;
           
            for (int j = 0; j < arrNilai[i].length; j++) {
                total += arrNilai[i][j];
            }
            rataRataMahasiswa[i] = total/arrNilai[i].length;

            if (rataRataMahasiswa[i] >= 60) {
                status[i] = "LULUS";
            } else {
                status[i] = "TIDAK LULUS";
            }

            // menampilkan nilai
            System.out.printf("%-15s", mahasiswa[i]);
            for (int j = 0; j < arrNilai[i].length; j++) {
                System.out.printf("%-15f", arrNilai[i][j]);
            }
            System.out.printf("%-10.2f %-10s\n", rataRataMahasiswa[i], status[i]);
             

        }

        System.out.println("-------------------------------------------------------------------------------------------");
        while(true) {
            sc.nextLine();
            System.out.print("Apakah anda ingin mencari nilai : ");
            String cari = sc.nextLine();
            if (cari.equals("t")) {
                break;
            } 
        
            System.out.println("Nilai yang ingin dicari : ");
            int key = sc.nextInt();

            for (int i = 0; i < arrNilai.length; i++) {
                for (int j = 0; j < arrNilai[i].length; j++) {
                    if (key == arrNilai[i][j]) {
                        System.out.println("Nilai "+ key + " ketemu, merupakan nilai mahasiswa ke-"+ (i+1) +" dan matkul ke-"+ (j+1));
                    }
                }
            }

        }





    }
}
