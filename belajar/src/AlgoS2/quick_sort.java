package AlgoS2;

public class quick_sort {

    public static void main(String[] args) {
        
        int[] array = {8, 2, 1, 3, 4, 6, 5, 7};

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
;
        quickSort(array, 0, array.length-1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        if (end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }

    public static int partition(int[] array, int start, int end) {

        int pivot = array[end]; 

        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
    
}