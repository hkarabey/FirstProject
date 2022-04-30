package week015;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        try{
            System.out.println("enter a number:");
            int num=scan.nextInt();
            System.out.println("you entered :"+num);

        }catch (InputMismatchException e){
            System.out.println("you enterd ınvalid value");
        }
        finally {
            scan.close();
            System.out.println("finally block run always");
        }
    }


}
