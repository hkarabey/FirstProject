package week06;

import java.util.Scanner;

public class UpperBound2Inportant {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid upper bound :");
        int upperBound = scan.nextInt();

        int sum = 0;
        boolean check = true;


        for( ; check ; ) {
             check = true;  // initialization

            for(  ; check   ;  ) {
                if (upperBound >= 1) {
                    for (int i = 1; i <= upperBound; i++) {
                        sum += i;
                    }

                    check = false;  // iteration

                } else {
                    System.out.println("Please Enter a Valid Number Again : ");
                    upperBound = scan.nextInt();
                    check = true;
                    //  check = true;  // iteration

                }
            }
            System.out.println("sum = " + sum);


    }
        scan.close();
    }}
