package methods;
/**
 * belajarmethod
 */
public class belajarmethod {
    static void methodku (String nama, int umur) {
        if (umur > 18) {
            System.out.println(nama + " Anda boleh melakukan JUDI");
            
        } else {
            System.out.println(nama + " Anda dilarang JUDI, DASAR BOCAHHH");
        }
    }

    public static void main(String[] args) {
        methodku("Yono", 17);
        
    }
}