package week05;

import java.util.Scanner;

public class QuızReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("what is the farthest planet from the earth");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String result = scan.next();
        switch (result) {
            case "a":
                System.out.println("a is wrong");
                break;

            case "b":
                System.out.println("b is true");
                break;

            case "c":
                System.out.println("c is wrong");
                break;
            default:
                System.out.println("invalid choıce");
                break;


        }
scan.close();

    }


}
