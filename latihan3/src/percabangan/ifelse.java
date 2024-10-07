package percabangan;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        
        System.out.println("grading nilai mahasiswa");

        //made new scanner
        Scanner scan = new Scanner(System.in);

        //deklarasi
        int nilai;
        String grade;

        //input nilai
        System.out.println("masukkan nilai anda : ");
        nilai = scan.nextInt();

        //percabangan
        if (nilai >= 95) {
            grade = "A+";
        } else if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B";
        } else if (nilai >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        //tampilkan grade
        System.out.println("grade nilai : "+ grade);

        
    }
}
