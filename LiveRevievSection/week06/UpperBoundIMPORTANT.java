package week06;

import java.util.Scanner;

public class UpperBoundIMPORTANT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write a upperbound");
        int upperBound = scan.nextInt();

        int sum = 0;
        boolean check = true;

            for (; check; ) {

                if (upperBound >= 0) {
                    for (int i = 0; i < upperBound; i++) {
                        sum += i;}
                        check = false;

                    } else{
                        System.out.println("write a valid number");
                        upperBound=scan.nextInt();
                        check = true;
                    }

                }
                System.out.println(sum);


        }


    }
