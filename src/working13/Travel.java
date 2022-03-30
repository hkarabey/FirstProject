package working13;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ticketCost = 1000;
        System.out.println("Is your passport valid? (Yes/No)");
        String validPassport = scan.next();

        scan.nextLine();

        System.out.println("which country will you travel?");
        String travelCountry = scan.nextLine();

        System.out.println("how many bags you will take ?");
        byte bags = scan.nextByte();

        System.out.println("how many people travel with you=?");
        short travelWithYou = scan.nextShort();

        scan.nextLine();

        System.out.println("enter name of people");
        String nameOfPeople = scan.nextLine();

        int totalCost1 = ticketCost + bags * 50 + 900 * 3;
        int totalCost2 = ticketCost + bags * 50 + 900 * travelWithYou;

        if (validPassport.equals("Yes") && travelWithYou >= 3) {
            System.out.println("your ticket is booked to" + travelCountry + ".We have charged extra for the" + bags + " bags amount of 50 for each bags" + "but you are travelling with " + travelWithYou + " person" + "ticket total cost is :" + totalCost1);
        } else if (validPassport.equals("Yes") && travelWithYou < 3) {
            System.out.println("your ticket is booked to" + travelCountry + ".We have charged extra for the" + bags + " bags amount of 50 for each bags" + "but you are travelling with " + travelWithYou + " person" + "ticket total cost is :" + totalCost2);
        } else {
            System.out.println("please take valid passport");
        }


        scan.close();
    }


}
