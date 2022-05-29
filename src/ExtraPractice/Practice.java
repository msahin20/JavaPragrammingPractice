package ExtraPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        int[] array = {8,1,2,3,3,4,5,5,6,7,7,7,2,4,60};

        //removeIndexOfElement(array, 4);
        uniqueElements(array);

        addIntToArray(array, 115);


    }

    public static void removeIndexOfElement(int[] arr, int ind) {

        int[] arrNew = new int[arr.length-1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {


            if (ind==i) {
                continue;
            }


                arrNew[j] = arr[i];
                j++;


        }
        System.out.println(Arrays.toString(arrNew));

    }

    public static void uniqueElements (int[] arr) {
        //int [] arrNew = new int[arr.length];
        int count;
        int [] arr2New= {};


        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (arr[i]==arr[i1]) {
                        count++;

                }


              }
            if (count == 1) {

                //arrNew [i] = arr[i];

                arr2New = addIntToArray(arr2New, arr[i]);

            }


        }
        //System.out.println(Arrays.toString(arrNew));

        //System.out.println(Arrays.toString(word.toCharArray()));


        System.out.println(Arrays.toString(arr2New));




    }

    public static int[] addIntToArray(int[] arr, int element) {

        int[] arrNew = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            arrNew [i] = arr[i];

        }
        arrNew[arr.length]= element;

        return arrNew;



    }
}
