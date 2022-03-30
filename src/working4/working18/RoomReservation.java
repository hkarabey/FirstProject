package working4.working18;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int price = 0;


        while (true) {


            System.out.println("which bedroom do you want to reserve");


            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");

            String bedrom = scan.nextLine();

            System.out.println("how many  night do you stay");
            int night = scan.nextInt();
            scan.nextLine();

            price += (bedrom.equalsIgnoreCase("King Bed")) ? 120 * night : (bedrom.equalsIgnoreCase("Queen Bed")) ? night * 100
                    : 80 * night;


            System.out.println("would you like to reserve another room");
            String answer = scan.nextLine();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("invalid answer write valid answer yes or no ");
                answer = scan.nextLine();

            }
            if (answer.equalsIgnoreCase("no")) {

                System.out.println(price);
                break;


            }


        }
        scan.close();
    }
}