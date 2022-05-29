package ExtraPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class nthLargestNumber {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n = 4;
        System.out.println(arrayList);

        for (int i = 1; i <n ; i++) {
            arrayList.removeIf(p -> p==Collections.max(arrayList));

        }
        System.out.println(Collections.max(arrayList));


    }
}
