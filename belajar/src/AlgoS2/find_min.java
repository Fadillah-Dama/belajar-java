package AlgoS2;

public class find_min {
    public static int findMin(int[] array, int l, int r) {
        if (l == r) {
            return array[l];
        }

        int mid = (l+r)/2;
        int minL = findMin(array, l, mid);
        int minR = findMin(array, mid+1, r);
        
        return (minL <= minR) ? minL : minR;
    }

    public static void main(String[] args) {
        int[] arrayNum = {78, 90, 96, 54, 40, 98};
        
        int min = findMin(arrayNum, 0, arrayNum.length-1);
        System.out.println("Nilai terkecil : "+ min);
    }
}
