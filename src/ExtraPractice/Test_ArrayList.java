package ExtraPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.set((list.size()-1), 0);
        System.out.println(list);
        list.set(0, list.get(list.size()-1));
        list.set(list.size()-1,list.get(0) );

        System.out.println(list);

        list.remove(list.size()-1);
        System.out.println(list);
        list.add(0);
        System.out.println(list);

        String pass = "Turkiye52@";
        char []chArray= pass.toCharArray();

        for (char each : chArray) {

            if (Character.isUpperCase(each)) {
                boolean b1 = true;
                System.out.println(each);
            } else if (Character.isLowerCase(each)){
                boolean b2= true;
                System.out.println(each);

            } else if (Character.isDigit(each)){
                boolean b3= true;
                System.out.println(each);
            }




        }

        ArrayList<Integer> listArray = new ArrayList<>();

        listArray.add(1);
        listArray.add(2);
        listArray.add(30);
        listArray.add(4);
        listArray.add(5);
        System.out.println(listArray);

        int max = listArray.get(0);

        for (int i = 1; i < listArray.size(); i++) {

             max = Integer.min(listArray.get(i), max);


        }
        System.out.println(max);







    }
}
