package AlgoS2;

public class selection_sort {

    public static int[] sorting(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;        
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
