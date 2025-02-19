package BelajarOop;

class Kubus {
    private double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    public void display() {
        System.out.println("Sisi : " + this.sisi);
    }

    // write only(SETTER), cirinya menggunakan void
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // read only sesuatu yang private(GETTER), cirinya menggunakan return nilai
    public double getLuas() {
        return sisi * sisi;
    }
}

public class encapsulation {
    public static void main(String[] args) {

        Kubus kubus1 = new Kubus(5);

        kubus1.display();
        System.out.println("Luas 1: " + kubus1.getLuas());
        kubus1.setSisi(100);
        kubus1.display();
        System.out.println("Luas 2: " + kubus1.getLuas());
        
    }
}
