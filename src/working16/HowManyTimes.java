package working16;

import java.util.Scanner;

public class HowManyTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write a number");
        int num1 = scan.nextInt();
        System.out.println("write a number");
        int num2 = scan.nextInt();
        System.out.println("write a number");
        int num3 = scan.nextInt();
        System.out.println("write a number");
        int num4 = scan.nextInt();
        System.out.println("write a number");
        int num5 = scan.nextInt();
        int numNmegatif = 0;
        int numPozitif = 0;
        if (num1 > 0) {
            numPozitif += 1;
        } else {
            numNmegatif += 1;
        }
        if (num2 > 0) {
            numPozitif += 1;
        } else {
            numNmegatif += 1;
        }
        if (num3 > 0) {
            numPozitif += 1;
        } else {
            numNmegatif += 1;
        }
        if (num4 > 0) {
            numPozitif += 1;
        } else {
            numNmegatif += 1;
        }
        if (num5 > 0) {
            numPozitif += 1;
        } else {
            numNmegatif += 1;
        }

        System.out.println(numPozitif + " positive and " + numNmegatif + " nagative");
    }


}
