package Pertemuan13;

import java.util.Scanner;

public class dasproTeori {

static void inputData(int array[][], String nama[], String mingguKe[]) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < array.length; i++) {
        System.out.println("Masukkan nilai mahasiswa "+ nama[i]+ " : ");
        for (int j = 0; j < array[i].length; j++) {
            System.out.print("Masukkan nilai "+ mingguKe[j]+ " : ");
            array[i][j] = sc.nextInt();
        }
    }
    sc.close();
    
}

static void tampilData(int array[][], String nama[], String mingguKe[]) {
    for (int i = 0; i < array.length; i++) {
        System.out.println("Mahasiswa "+ nama[i]);
        for (int j = 0; j < array[i].length; j++) {
            System.out.println("Nilai mahasiswa "+ mingguKe[j] + " : "+ array[i][j]);
        }
    }
}

static void  mingguNilaiTertinggi(int array[][], String mingguKe[]) {
    int highest = 0;
    String mingguTertinggi = "";

    for (int j = 0; j < mingguKe.length; j++) {
        int totalNilai = 0;
        for (int i = 0; i < array.length; i++) {
            totalNilai += array[i][j];           
        }
        if (totalNilai > highest) {
            highest = totalNilai;
            mingguTertinggi = mingguKe[j];
        }
    }
    System.out.println("Nilai tertinggi ada di minggu ke- : "+ mingguTertinggi);
    System.out.println("Dengan totalNilai : "+ highest);
}

static void mahasiswaTertinggi(int array[][], String nama[], String mingguKe[]) {
    int tertinggi = 0;
    String mingguTertinggi = "";
    String namaTertinggi = "";

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            if (array[i][j] > tertinggi) {
                tertinggi = array[i][j];
                namaTertinggi = nama[i];
                mingguTertinggi = mingguKe[j];
            }
        }
    }
    System.out.println("nilai Mahasiswa tertinggi" + " adalah " + namaTertinggi + " dengan nilai " + tertinggi + " pada "+ mingguTertinggi);
}

public static void main(String[] args) {

    // int[][] nilai = {
    // {20, 19, 25, 20, 10, 0, 10}, 
    // {30, 30, 40, 10, 15, 20, 25}, 
    // {5, 0, 20, 25, 10, 5, 45}, 
    // {50, 0, 7, 8, 0, 30, 60},
    // {15, 10, 16, 15, 10, 10, 5 }}; // nilai mahasiswa

    int nilai[][] = new int[5][7];
    String[] nama = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    String[] mingguKe = {"minggu 1", "minggu 2", "minggu 3", "minggu 4", "minggu 5", "minggu 6", "minggu 7"};

    inputData(nilai, nama, mingguKe);

    tampilData(nilai, nama, mingguKe);

    mingguNilaiTertinggi(nilai, mingguKe);

    mahasiswaTertinggi(nilai, nama, mingguKe);
    }
}
