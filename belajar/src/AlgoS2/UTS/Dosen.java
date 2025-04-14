package AlgoS2.UTS;

public class Dosen {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    Dosen(String kd, String nm, String jk, int age) {
        this.kode = kd;
        this.nama = nm;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil() {
        System.out.println("Kode            : " + this.kode);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Jenis kelamin   : " + this.jenisKelamin);
        System.out.println("Usia            : " + this.usia);
        System.out.println("-----------------------------------");
    }
}
