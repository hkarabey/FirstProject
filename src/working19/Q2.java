package working19;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("write a side of the square");
        int side = scan.nextInt();
        if (side <= 0) {
            System.out.println("Invalid Entry for the side of the square");
            System.exit(0);
        }
        System.out.println("Perimeter= " + (4 * side));
        System.out.println("diameter= " + (side * side));

        while (true) {
            System.out.println("Would you like to calculate another Square?");
            String anwer = scan.next();


            while (!(anwer.equalsIgnoreCase("yes") || anwer.equalsIgnoreCase("no"))) {
                System.out.println("invalid answer write yes or no");
                anwer= scan.next();
            }
            if (anwer.equalsIgnoreCase("yes")) {
                System.out.println("write a side of the square");
                 side = scan.nextInt();
                if (side <= 0) {
                    System.out.println("Invalid Entry for the side of the square");
                    System.exit(0);
                }
                System.out.println("Perimeter= " + (4 * side));
                System.out.println("diameter= " + (side * side));
            } else if (anwer.equalsIgnoreCase("no")) {
                System.out.println("thank yo for calculating");
                break;
            }
        }
    }

}
