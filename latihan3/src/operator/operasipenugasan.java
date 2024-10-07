package operator;

public class operasipenugasan {
    public static void main(String[] args) {
        System.out.println("operasi penugasan");

        //deklarasi
        int a, b, c;

        //input
        a = 10;
        b = 5;
        c = 7;

        //penambahan
        a += b ;       //bisa diulangi dengan outputnya disimpan di var pertama
        System.out.println("penambahan : "+ a);

        //sisa bagi 
        a %= b;
        System.out.println("sisa bagi : "+ a);

        //pembagian 
        a /= b;
        System.out.println("hasil bagi : "+ a);
       }
}
