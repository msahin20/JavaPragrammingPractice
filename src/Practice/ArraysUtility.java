package Practice;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        //toString(): converts array object to string, returns String
        String [] names = {"John", "Smith", "Shay", "Breanna", "Josh"};
        System.out.println(Arrays.toString(names));

        //sort(): sorts the array in ascending order
        int[] numbers= {5, 1, 3, 4, 2, 0};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //equals():  compares two array objects if they have same elements in same order. returns boolean

        char[] arr1 = {'a', 'b','c'};
        char[] arr2 = {'a', 'b','c'};

        System.out.println(arr1==arr2);
        System.out.println(Arrays.equals(arr1, arr2));

        //sorting than comparing

        char []arr3= {'b', 'c','a'};

        System.out.println(Arrays.equals(arr1,arr3));
        Arrays.sort(arr3);
        Arrays.sort(arr1);
        System.out.println(Arrays.equals(arr1,arr3));

        //copyOf(array,newLength): copies the specified range of the array, returns new array

        int[] scores = {45,55,65,75,85};
        int[] scores2= Arrays.copyOf(scores, 8);
        int[] scores3= Arrays.copyOf(scores, 3);


        System.out.println(Arrays.toString(scores2));
        System.out.println(Arrays.toString(scores3));

        //copyOfRange(array, begIndex, endIndex); copies the specified range of the array, returns new array

        char[] elements = {'A','B','C','D','E','F'};

        char[] someelements = Arrays.copyOfRange(elements, 1, 4);  //ending index excluded

        System.out.println(Arrays.toString(someelements));









    }
}
