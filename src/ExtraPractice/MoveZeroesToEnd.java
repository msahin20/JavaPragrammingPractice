package ExtraPractice;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int []arr1 = {10, 0, 5, 0, 1, 0};
        int []arr2 = new int[arr1.length];
        int j =0;

        for (int i = 0; i <=arr1.length-1 ; i++) {

            if (arr1[i]==0){
                continue;
            }
            arr2[j]=arr1[i];

            j++;




        }

        System.out.println(Arrays.toString(arr2));
    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */