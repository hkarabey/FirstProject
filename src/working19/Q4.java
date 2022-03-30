package working19;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter your score");
            int score = scan.nextInt();

            if (!(score >= 0 && score <= 100)) {
                System.out.println("invalid score ");
                System.exit(0);
            }
            if (score >= 90) {
            } else if (score >= 80 && score < 90) {
                System.out.println("A");
            } else if (score >= 80 && score < 90) {
                System.out.println("B");
            } else if (score >= 70 && score < 80) {
                System.out.println("C");
            } else if (score >= 60 && score < 70) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("would you like to continue");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("invalid answer write your answer yes or no");
                answer=scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("thank you");
                break;
            }


        }

    }
}
