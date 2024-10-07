package belajararray;

public class rata2_usia {
    public static void main(String[] args) {
        
        int umur[] = {90, 20, 30, 23, 23};
        float ratarata, sum;
        sum = 0;
        int length = umur.length;

    //sistem menghitung rata rata umur dari data yang tersedia
        for (int usia : umur) {
            sum += usia;
        }
        ratarata = sum / length;

        System.out.println("rata rata umurnya : "+ ratarata);

    //sistem menghitung umur terkecil 
       int lowestage = umur[0];

       for (int usia : umur) {
        if (lowestage > usia) {
            lowestage = usia;
        }
       }
       System.out.println("umur terendah dalam array adalah : "+lowestage);
    }
}
