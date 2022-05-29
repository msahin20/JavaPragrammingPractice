package Practice;

import java.util.Scanner;

public class day16Practice_Frequence_of_the_Word {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence :");
        String sentence = input.nextLine();
        System.out.println("Enter repeating word :");
        String word = input.next();
        String wordNew = "";
        int inc = 0;

        for (int i = 0; i <= sentence.length()-1; i++) {
            wordNew+=sentence.charAt(i);
            //System.out.println(wordNew);

                    if (wordNew.contains(word)){
                         inc+= 1;
                         wordNew = "";


                    }

        }

        System.out.println(inc);


    }
}
