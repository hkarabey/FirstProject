package working19;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
while (true){
        System.out.println("how much you make an hour");
        int make = scan.nextInt();

        if (make <= 0) {
            System.out.println("invalid entery for making an hour");
            System.exit(0);
        }
        System.out.println("how many hour do you work per week ");
        int workHour = scan.nextInt();

        if (workHour < 1 || workHour > 144) {
            System.out.println("invalid entry for working per week");
            System.exit(0);
        }
        System.out.println("enter your tax rate");
        int taxRate = scan.nextInt();

        if (taxRate <= 0 || taxRate >= 10) {
            System.out.println("invalid entry for tax rate");
            System.exit(0);
        }


        System.out.println("would you like to continue");
        String answer = scan.next();

        if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("invalid entery");
            System.exit(0);
        }
        if (answer.equalsIgnoreCase("no")) {
            break;
        }

    }


    }




}
