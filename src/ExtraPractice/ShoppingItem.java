package ExtraPractice;

import java.util.Arrays;

public class ShoppingItem {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        for (int i = 0; i <= items.length - 1; i++) {

            if (items[i].contains("Gloves")) {
                System.out.println("First index number of Gloves: " + i);

            }
            if (items[i].toLowerCase().contains("ipad")) {
                System.out.println("iPad is contained in the item List ");


            }

        }
        for (int i = 0; i <= items.length - 1; i++) {

        System.out.println(items[i] + " - " + prices[i] + " - " + itemIDs[i]);
    }

    }
}


/*
String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
 */
