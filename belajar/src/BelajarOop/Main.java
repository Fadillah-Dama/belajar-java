package BelajarOop;

class Mahasiswa {
   
}

public class Main {

    public void fullthrothle() {
        System.out.println("Mobil akan melaju dengan kecepatan penuh!");
    }

    public void kecepatan(int kecepatan) {
        System.out.println("Mobil akan melaju dengan kecepatan " + kecepatan + " km/jam!");
    }
   
    public static void main(String[] args) {
       
        Main myCar = new Main();
        myCar.fullthrothle();
        myCar.kecepatan(250);
       
    }
}
