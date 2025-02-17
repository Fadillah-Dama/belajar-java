package BelajarOop;

class Mahasiswa {
    String name; // ini default
    public String kelas; // sama seperti default, bisa diakses di luar class
    private String NIM; // hanya bisa diakses dan dibaca di dalam class

    Mahasiswa(String name, String kelas, String NIM) {
        this.name = name;
        this.kelas = kelas;
        this.NIM = NIM;
    }

    // default
    void display() {
        changeKelas("SIB-1C");
        System.out.println("\nName    : " + this.name);
        System.out.println("Kelas   : " + this.kelas);
        System.out.println("NIM     : " + this.NIM);
    }

    // sama seperti default, dapat diakses dimana saja
    public void setNIM(String newString) {
        this.NIM = newString;
    }

    // hanya bisa diakses di dalam class saja karna private
    private void changeKelas(String newKelas) {
        this.kelas = newKelas;
    }
}

public class modifiers {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Yono", "TI-1C", "244107020149");

        mahasiswa1.display();
        mahasiswa1.setNIM("20000000");
        mahasiswa1.display();

        

        
    }
}
