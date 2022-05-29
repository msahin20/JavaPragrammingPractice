package Practice;

import java.util.Scanner;

public class day16Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String completeSentence = input.nextLine();
        String newSentence = "";

        for (int i = completeSentence.length()-1; i >=0 ; i--) {
            newSentence+= completeSentence.charAt(i);
            //System.out.println(newSentence);

        }
        System.out.println(newSentence);

    }
}
