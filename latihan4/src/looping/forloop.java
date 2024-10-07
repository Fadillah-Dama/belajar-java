package looping;

public class forloop {
    public static void main(String[] args) {
        
        int x, y;
        for ( x = 0; x <=100; x+=10){
            System.out.println("outer"+ x);
            for (y = 1; y <= 5; y++){
                if (y == 3) {
                    continue;
                }
                System.out.println("  inner"+ y);
            }
        }
    }
}

