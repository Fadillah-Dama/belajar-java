package AlgoS2;

public class find_max {
    public static int findMax(int[] array, int l, int r) {
        if (l == r) {
            return array[l];
        }

        int mid = (l+r)/2;
        int maxL = findMax(array, l, mid);
        int maxR = findMax(array, mid+1, r);
        
        return (maxL >= maxR) ? maxL : maxR;
    }

    public static int findMaxBF(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) max = array[i]; 
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arrayNum = {7, 76, 78, 93, 89, 90, 100};

        int max = findMax(arrayNum, 0, arrayNum.length-1);
        System.out.println("Nilai tertinggi : "+ max);

        max = findMaxBF(arrayNum);
        System.out.println("Nilai tertinggi BF : "+ max);
    }
}
