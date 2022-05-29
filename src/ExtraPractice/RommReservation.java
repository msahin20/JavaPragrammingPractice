package ExtraPractice;

import java.util.Locale;
import java.util.Scanner;

public class RommReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Want to reserve a room? ");
        String wantRoom = "" + input.nextLine();
        boolean valid_entry = wantRoom.contains("yes") || wantRoom.contains("no");


        while (valid_entry == false) {
            System.err.println("provide a valid entry");
            wantRoom = "" + input.nextLine();
            valid_entry = wantRoom.contains("yes") || wantRoom.contains("no");

        }
        if (wantRoom.contains("yes")) {
            System.out.println("type of the room you want to reserve: ");
            String typeOfBed = input.nextLine().toLowerCase();
            Boolean valid_bed = typeOfBed.contains("king bed") || typeOfBed.contains("queen bed") || typeOfBed.contains("single bed");
            while (valid_bed == false) {
                System.out.println("provide a valid entry");
                typeOfBed = "" + input.nextLine().toLowerCase();
                valid_bed = typeOfBed.contains("king bed") || typeOfBed.contains("queen bed") || typeOfBed.contains("single bed");

            }
                if (typeOfBed.contains("king bed")){
                    System.out.println("King Bed ==> 120$");
                } else if (typeOfBed.contains("queen bed")){
                    System.out.println("Queen Bed ==> 100$");
                } else if (typeOfBed.contains("single bed")){
                    System.out.println("single Bed ==> 80$");
                }


        } else if (wantRoom.contains("no")) {

            System.out.println("Have a nice day!");
            //System.exit(0);
        }


    }
}


