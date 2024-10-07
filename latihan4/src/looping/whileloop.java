package looping;

public class whileloop {
   public static void main(String[] args) {
       
    int num = 1;
    while (num < 10) {
        
        if (num == 5) {
            num++;
            continue;
        }
        System.out.println(num);
        num++;
    }
System.out.println("----------------"); // do while setidaknya mengoutuput nilai satu kali
    do { 
        System.out.println(num);
        num++;
    } while (num < 1);

System.out.println("----COUNTDOWN PROGRAM----"); //RL example

    int count = 10;
    do { 
        System.out.println(count);
        count--;
    } while (count >= 1 );



   }
}
