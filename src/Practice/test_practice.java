package Practice;

import java.util.Scanner;

public class test_practice {

    public static void main(String[] args) {

        int num = 2;
        boolean b = true;

        switch (num){

            case 2:
                if (b){
                    System.out.println(2);
                }else {
                    b =false;

                }
            case 3:
                if(b){
                    System.out.println(3);
                    b = false;

                }else {
                    break;
                }
            case 4 :
                System.out.println(4);
            case 5 :
                if(!b) {
                    break;
                }
                System.out.println(5);

        }

    }
}