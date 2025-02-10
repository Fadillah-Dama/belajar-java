package BelajarOop;

class Polos {    // pembuatan class
    String nama;
    int umur;

    // contructor beserta parameternya
    public Polos(String inputNama, int inputUmur) {
        nama = inputNama;
        umur = inputUmur;

        System.out.println("Identitas anda : " + nama + " dengan umur "+ umur);
    }
}

public class constructor {
    public static void main(String[] args) {
        // pembuatan object
        Polos identitas = new Polos("Dama", 18);
        Polos identitas2 = new Polos("Joni", 20);


        // identitas.nama = "Dama";
        // identitas.umur = 18;

        // System.out.println("Identitas anda : " + identitas.nama + " dengan umur "+ identitas.umur);
        // System.out.println("Identitas anda : " + identitas2.nama + " dengan umur "+ identitas2.umur);
    }
}
