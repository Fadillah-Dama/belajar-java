package AlgoS2;

public class P1Teori_No2 {
    public static void main(String[] args) {
        int[][] arrRating = {
            {4, 3, 4, 4},
            {1, 1, 2, 3},
            {1, 2, 3, 4}
        };
        double[] rataRating = new double[arrRating[0].length];

        hitungRata(arrRating, rataRating);
        tertinggiTerendah(rataRating, arrRating);
    }

    static double[] hitungRata(int[][] arrRating, double[] rataRating) {
        for (int j = 0; j < arrRating[0].length; j++) {
            double rata = 0;
            double total = 0;
            for (int i = 0; i < arrRating.length; i++) {
                 total += arrRating[i][j];
            }
            rata = total / arrRating.length;
            System.out.printf("Rata rata dari film ke-%d adalah : %.2f\n", (j+1), rata);
            rataRating[j] = rata;
            
        }
        double[] a = rataRating;
        return a;
    }

    static void tertinggiTerendah(double[] rataRating, int[][] arrRating) {
        double min = rataRating[0];
        double max = rataRating[0];
        int indexTertinggi = 0, indexTerendah = 0;

        for (int i = 0; i < arrRating[0].length; i++) {
            if (rataRating[i] < min) {
                min = rataRating[i];
                indexTerendah = i;
            }
            if (rataRating[i] > max) {
                max = rataRating[i];
                indexTertinggi = i;
            }
        }

        for (int i = 0; i < rataRating.length; i++) {
            if (rataRating[i] == rataRating[indexTertinggi]) {
                System.out.printf("Film dengan rating tertinggi adalah film ke-%s dengan rata-rata: %.2f\n",(i+1) ,max);
            }
            if (rataRating[i] == rataRating[indexTerendah]) {
                System.out.printf("Film dengan rating terendah adalah film ke-%s dengan rata-rata: %.2f\n",(i+1) ,min);
            }
        }
        
        

    }
}
