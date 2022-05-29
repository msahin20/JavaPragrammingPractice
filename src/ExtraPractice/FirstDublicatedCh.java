package ExtraPractice;

import java.util.Scanner;

public class FirstDublicatedCh {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String input= scan.nextLine();

        char output;
        int counter = 1;

        for (int i = 0; i <=input.length()-1 ; i++) {

            if (input.charAt(i) == input.charAt(i+1) ) { //true
                output = input.charAt(i);
                System.out.println(output);
                System.out.println(i);
                break;
            }
            scan.close();


        }


    }
}
