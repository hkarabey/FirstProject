package working17;

import java.util.Locale;
import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("wants to reserve a room");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("your answer is invalid");
            System.out.println("write your answer please yer or no");
            answer = scan.next().toLowerCase();
        }
        if (answer.equals("no")) {
            System.out.println("have a nice day");

        } else {
            System.out.println("which type of room do you want");
            answer = scan.next();
            if (answer.equals("king")) {
                System.out.println("180$");
            } else if (answer.equals("queen")) {
                System.out.println("100$");
            } else if (answer.equals("single")) {
                System.out.println("50$");
            }

        }

        scan.close();
    }
}
