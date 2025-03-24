package AlgoS2;

public class merge_sort {

    public static void main(String[] args) {
        
        int[] array = {1, 8, 2, 4, 3, 6, 5, 7};

        mergeSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return; // base case

        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        // indices
        int i = 0;
        int j = 0;

        // copy array for left and right
        for (; i < length; i++) {
            if (i < mid) {
                left[i] = array[i];
            } else {
                right[j] = array[i];
                j++;
            }
        }

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        // indices
        int i = 0;
        int l = 0;
        int r = 0;

        while (l < leftSize && r < rightSize) {
            if (left[l] < right[r]) {
                array[i] = left[l];
                i++;
                l++;
            } else {
                array[i] = right[r];
                i++;
                r++;
            }
        }

        // for when array length = 1 (only 1 element)
        while (l < leftSize) {
            array[i] = left[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = right[r];
            i++;
            r++;
        }
    }
}
