package methods;

public class recursionmethod {
    public static void main(String[] args) {
        int hasil = mySum(1, 10);
        System.out.println(hasil);
    }

    public static int mySum(int start, int end) {
        if (start < end) {
            return start + mySum(start, end - 1); 
        } else {
            return 0;
        }
    }
}
