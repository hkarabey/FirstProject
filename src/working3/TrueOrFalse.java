package working3;

import java.util.Scanner;

public class TrueOrFalse {
    public static void main(String[] args) {
        System.out.println("WRİTE 4 NUMBERS");
        Scanner scan=new Scanner(System.in);
        int number1=scan.nextInt(),
                number2=scan.nextInt(),
                number3= scan.nextInt(),
                number4= scan.nextInt();
        boolean boo=number1>number2&&number3<number4;
        if(boo){

            System.out.println("boo");
        }
        else{
            System.out.println("noo");
        }

    }




}
