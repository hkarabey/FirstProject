package working19;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while (true) {
            System.out.println("write a length of recktangle");

            int len = scan.nextInt();
            if (len <= 0) {
                System.out.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            System.out.println("write a width of rectangle");
            int wid = scan.nextInt();
            if (wid <= 0) {
                System.out.println("invalid entry for the width of the rectangle");
                System.exit(0);
            }
            System.out.println("area: " + (wid * len));
            System.out.println("perimeter: " + (2 * (wid + len)));

            System.out.println("would you like to another rectangle");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("invalid entry write yes or no");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("thank you");
                break;
            }


        }
    }



}
