package working19;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write a radıus");
        int radıus = scan.nextInt();
        if (radıus <= 0) {
            System.out.println("Invalid Entry for the radius of the circle");
            System.exit(0);
        }
        System.out.println("diameter= " + (2 * 3.14 * radıus));
        System.out.println("area= " + (2 * 3.14 * radıus * radıus));

        while (true) {
            System.out.println("would you like to another circle");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("invalid answer write your answer like yes or no");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("write a radıus");
                radıus = scan.nextInt();
                if (radıus <= 0) {
                    System.out.println("Invalid Entry for the radius of the circle");
                    System.exit(0);
                }
                System.out.println("diameter= " + (2 * 3.14 * radıus));
                System.out.println("area= " + (2 * 3.14 * radıus * radıus));
            }
                if (answer.equalsIgnoreCase("no")) {
                    System.out.println("thank you");
                    break;
                }

            }
        }


    }



