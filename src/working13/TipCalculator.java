package working13;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Split or No split (Yes or No)?");
        String split = scan.next();

        System.out.println("Enter the number of people");
        int numberPeople = scan.nextInt();

        System.out.println("Enter the check amount");
        double amount = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scan.next();

        double Poor = amount * 1.05, Fair = amount * 1.10, Good = amount * 1.15, Great = amount * 1.20, Excellent = amount * 1.25;
        if (split.equals("Yes")) {
            if (quality.equals("Excellent")) {
                System.out.println("number of people : " + numberPeople);
                System.out.println("Total to pay : " + Excellent);
                System.out.println("Total tip : " + amount * 0.25);
                System.out.println("Total per person : " + Excellent / numberPeople);
                System.out.println("Tip per person : " + amount * 0.25 / 4);
            } else if (quality.equals("Great")) {
                System.out.println("number of people : " + numberPeople);
                System.out.println("Total to pay : " + Great);
                System.out.println("Total tip : " + amount * 0.2);
                System.out.println("Total per person : " + Great / numberPeople);
                System.out.println("Tip per person : " + amount * 0.20 / 4);
            } else if (quality.equals("Good")) {
                System.out.println("number of people : " + numberPeople);
                System.out.println("Total to pay : " + Good);
                System.out.println("Total tip : " + amount * 0.15);
                System.out.println("Total per person : " + Good / numberPeople);
                System.out.println("Tip per person : " + amount * 0.15 / 4);
            } else if (quality.equals("Fair")) {
                System.out.println("number of people : " + numberPeople);
                System.out.println("Total to pay : " + Fair);
                System.out.println("Total tip : " + amount * 0.10);
                System.out.println("Total per person : " + Fair / numberPeople);
                System.out.println("Tip per person : " + amount * 0.10 / 4);
            } else if (quality.equals("Poor")) {
                System.out.println("number of people : " + numberPeople);
                System.out.println("Total to pay : " + Poor);
                System.out.println("Total tip : " + amount * 0.05);
                System.out.println("Total per person : " + Poor / numberPeople);
                System.out.println("Tip per person : " + amount * 0.05 / 4);
            }

        }
        if (split.equals("No")) {
            System.out.println("number of people : " + numberPeople);
            if (quality.equals("Excellent")) {
                System.out.println("Total to pay : " + Excellent);
                System.out.println("Total tip : " + amount * 0.25);
            } else if (quality.equals("Great")) {
                System.out.println("Total to pay : " + Great);
                System.out.println("Total tip : " + amount * 0.2);
            } else if (quality.equals("Good")) {
                System.out.println("Total to pay : " + Good);
                System.out.println("Total tip : " + amount * 0.15);
            } else if (quality.equals("Fair")) {
                System.out.println("Total to pay : " + Fair);
                System.out.println("Total tip : " + amount * 0.10);
            } else if (quality.equals("Poor")) {
                System.out.println("Total to pay : " + Poor);
                System.out.println("Total tip : " + amount * 0.05);
            }

        }
        scan.close();
    }

}
