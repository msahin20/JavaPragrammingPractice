package ExtraPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        String []arr1 = {"A", "l", "C", "Z"};
        String []arr2 = {"D", "E", "F", "G"};
        ArrayList<String> list = new ArrayList<>();
        list = mergeArrays(arr1,arr2);

        System.out.println(list);
        System.out.println(mergeArrays(arr1,arr2));
        System.out.println("_________________________________________________");

        int[] arr3 ={1,2,2,3,4,5,6,7};
        int[] arr4 = new int[0];
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));


        ArrayList<Integer> nlist = new ArrayList<Integer>();
        nlist = mergeArrays(arr3,arr4);
        System.out.println(nlist);

        System.out.println((firstDub(nlist)));


    }
    public static ArrayList<String> mergeArrays(String arr1[], String arr2[] ) {
        ArrayList <String>nlist = new ArrayList();


        for (String each1 : arr1) {
            nlist.add(each1);
        }
        for (String each2 : arr2) {
            nlist.add(each2);
        }
        return nlist;
    }

    public static ArrayList<Integer> mergeArrays(int arr1[], int arr2[] ) {
        ArrayList <Integer>nlist = new ArrayList();


        for (int each1 : arr1) {
            nlist.add(each1);
        }
        for (int each2 : arr2) {
            nlist.add(each2);
        }
        return nlist;
    }



    public static String firstDub(ArrayList<Integer> arr1) {
        System.out.println(arr1);
        String t1="";

        for (int i = 0; i < arr1.size()-1; i++) {

            if (arr1.get(i).equals(arr1.get(i+1))){
                t1 += arr1.get(i);
                break;

            } else if (i ==arr1.size()-1){
                System.err.println("No dublicated element");
                System.exit(0);
            }
        }
        return (t1);


    }


}


/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */