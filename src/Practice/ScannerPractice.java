package Practice;
//import java.util.*;  //wild import: imports everything from the package
//import java.util.Scanner;


import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Ask user enter integer number
        System.out.println("Enter an integer number");
        int num1=input.nextInt();

        //Ask user decimal  number
        System.out.println("Enter a decimal number");
        double num2=input.nextDouble();

        //Ask user enter a word
        System.out.println("Enter a word");
        String str = input.next();   //this method reads until the space. otherwise use nextLine method

        System.out.println("number = " + num1);
        System.out.println(num2);
        System.out.println(str);



    }
}
