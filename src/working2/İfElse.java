package working2;

import java.util.Scanner;

public class İfElse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a number");

        double x =scan.nextDouble();
        if (x>10){
            System.out.println(x+" is bigger than "+10);
        }
        else{

            System.out.println(x+" is smaller than "+10);
        }




    }



}
