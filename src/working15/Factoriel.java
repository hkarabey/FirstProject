package working15;

import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a number for calculating factorıel");
        int num=scan.nextInt();
        int fac=1;
        for (int i = num; i >0 ; i--) {
          fac*=i;



        }

        System.out.println(fac);
scan.close();
    }


}
