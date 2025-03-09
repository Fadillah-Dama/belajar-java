package latihan1;

import java.util.Scanner;

public class end_of_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        System.out.println("Ctrl + z the enter to stop or input 'stop': ");

        while (sc.hasNext()) {
            String input = sc.nextLine();
            i++;
            if (input.equalsIgnoreCase("stop")) break;
            System.out.println(i + " " + input);
        }

        System.out.println("You stop the loop");
    }
}