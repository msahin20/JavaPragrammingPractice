package ExtraPractice;

public class CommonElements {
    public static void main(String[] args) {
        int [] arr1 = {1,2,4,4,8};
        int [] arr2 = {4,5,6,7,8};
        String out = "";

        

        for (int i = 0; i <=arr1.length-1 ; i++) {
            String ch = arr1 [i] +"";

            for (int j = 0; j < arr2.length; j++) {

                if((arr1[i]==arr2[j])&(!out.contains(ch))){
                    out = out + arr1[i] + " " ;

                }

            }

        }
        System.out.println(out);

    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */