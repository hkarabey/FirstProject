package working16;

import java.util.Scanner;

public class WıthoutMultıple {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write a number");
        int num1= scan.nextInt();
        System.out.println("write a number");
        int num2= scan.nextInt();
        int numSolutıon=0;

        if(num1>0&&num2>0) {


            for (int i = 1; i <= num2; i++) {
                numSolutıon += num1;

            }
            System.out.println(numSolutıon);

        }
        else{
            System.out.println("invalid");
        }

        scan.close();
    }


}
