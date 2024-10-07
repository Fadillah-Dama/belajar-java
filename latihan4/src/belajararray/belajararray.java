package belajararray;

public class belajararray {
    public static void main(String[] args) {
        
        String[] mobil = {"sedan", "bmw", "toyota", "xpander"};
        System.out.println(mobil[0]);

        int[] nomor = {10,20,30,40,50};
        System.out.println(nomor[2]);

        //loop through array
        for (int num = 0; num < mobil.length; num++){
            System.out.println("mobil : "+ mobil[num]);
        }
    }
}
