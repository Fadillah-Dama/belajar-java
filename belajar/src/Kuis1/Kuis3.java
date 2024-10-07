package Kuis1;

import java.util.Scanner;

public class Kuis3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------- Progran Menghitung Jam Kuliah ----------");
        System.out.print("Masukkan jam saat ini : ");
        int currentHours = input.nextInt();
        System.out.print("Masukkan menit saat ini : ");
        int currentMinutes = input.nextInt();
        System.out.println("Jam saat ini : " + currentHours + ":" + currentMinutes + "\n");

        System.out.print("Masukkan lama kuliah dalam menit : ");
        int lectureTime = input.nextInt(); // 90

        int minute = lectureTime % 60; //30
        int jam = lectureTime / 60; // 1

        int minutePulang = (currentMinutes + minute) % 60;
        int minutePlus = (currentMinutes + minute) / 60;
        int jamPulang = currentHours + jam + minutePlus;

        System.out.println("Waktu kepulangan anda " + jamPulang + ":" + minutePulang);

    }
}