package working3;

import java.util.Scanner;

public class İfScan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write your age.");

        int old= scan.nextInt();

        if (old>=18){
            System.out.println("your age is "+old+" and you can drink");
        }else{
            System.out.println("your age is "+old+" and you can not drink");
        }



    }



}
