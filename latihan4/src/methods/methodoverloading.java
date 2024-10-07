package methods;

public class methodoverloading {


    static int myPlus(int x, int y) {
        return x + y;
    }

    static double myPlus(double x, double y) {
        return x - y ;
    }
    public static void main(String[] args) {
        int myOperator1 = myPlus(5, 7);
        double myOperator2 = myPlus(3.2, 2.8);
        System.out.println("opersi int : "+ myOperator1);
        System.out.println("operasi double : "+ myOperator2);
    }
}
