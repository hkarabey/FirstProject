package working4.working18;

import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("wriete a number");
            int n1 = scan.nextInt();

            System.out.println("write a math operator");
            char operator = scan.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("invalid operator write valid marh operator");
                operator = scan.next().charAt(0);
            }
            System.out.println("write second number");
            int n2 = scan.nextInt();


            if (operator == '+') {
                System.out.println(n1 + n2);
            } else if (operator == '-') {
                System.out.println(n1 - n2);
            } else if (operator == '*') {
                System.out.println(n1 * n2);
            } else if (operator == '/') {
                System.out.println(n1 / n2);
            }
            System.out.println("do you want to contınue");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("write valid answer");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("thanks for cydeo calculator");
            break;
            }
        }
    }


}
