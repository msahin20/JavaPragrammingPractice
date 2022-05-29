package ExtraPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

        System.out.println("how many numbers you want to enter to get the average: ");
        int n = scan.nextInt();

        float [] arr1 = new float[n];
        float sum = 0;
        System.out.println("Enter your numbers");

        for (int i = 0; i <n ; i++) {
            arr1[i] = scan.nextFloat();


        }
        for (int i = 0; i <n ; i++) {
            sum += arr1[i];


        }
        System.out.println("average of the numbers is :" + sum/n);
        System.out.println(Arrays.toString(arr1));



}

}

/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */