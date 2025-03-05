package Kuis1_S2;

public class Barang {
    String kode;
    String jenis;
    String nama;
    int stock;
    int harga;

    public Barang(String kode, String nama, String jenis, int stock, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.jenis = jenis;
        this.stock = stock;
        this.harga = harga;
    }

    public void tampilData() {
        System.out.printf("%-10s %-10s %-10s %-10d %-10d\n", this.kode, this.nama, this.jenis,
        this.stock, this.harga);
    }
    
}

