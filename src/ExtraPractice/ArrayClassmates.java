package ExtraPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassmates {
    public static void main(String[] args) {
        String [] classmates = {"java", "python", "c#"};
        String [] revclassmates = new String[3];
        String rev ="";
        //Scanner input = new Scanner(System.in);

        for (int i = 0; i <= classmates.length-1 ; i++) {
            for (int j = classmates[i].length()-1; j >=0 ; j--) {
                rev+=classmates[i].charAt(j);
            }
            //revclassmates[i]= rev;
            System.out.println(rev);
            rev="";




            }
        //System.out.println(Arrays.toString(revclassmates));







    }
}
