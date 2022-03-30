package working2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("what is the price of the product");

        double price=scan.nextDouble();
        double x= (price-(price*0.1));
        System.out.println("new price of the product is $"+x);



    }






}
