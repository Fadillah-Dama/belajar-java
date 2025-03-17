package AlgoS2;

public class bubble_sort {

    public static int[] sorting(int[]array) {
        // bubble sorting
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arrayOfNum = {10,8,7,4,3,2,1,5,6,9};

        // print array before sorting
        for (int i : arrayOfNum) {
            System.out.print(i+" ");
        }

        System.out.println("\n---------------");
        
        // print array after sorting
        for (int i : sorting(arrayOfNum)) {
            System.out.print(i+" ");
        }
    }
}
