package BelajarOop;

class Dosen{
    String nama;
    String jurusan;
    int umur;

    // constructor
    Dosen(String nama, String jurusan, int umur){
        this.nama = nama;
        this.jurusan = jurusan;
        this.umur = umur;
    }

    // method (bisa menggunaan parameter dan dapat mereturn nilai seperti yg ada di s1)
    void tampilkan(){
        System.out.println("Nama    : "+ this.nama);
        System.out.println("Jurusan : "+ this.jurusan);
        System.out.println("Umur    : "+ this.umur);
    }

    void setNama(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    int IPK(int umur){
        int total = this.umur + 5;
        return total;
    }
}

public class method {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("Yono", "Teknologi Informasi", 40);

        dosen1.tampilkan();
        dosen1.setNama("Tanto", 51);
        dosen1.tampilkan();
        int hasilUmur = dosen1.IPK(30);
        System.out.println(hasilUmur + 4);


    }
}
