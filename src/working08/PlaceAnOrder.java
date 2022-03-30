package working08;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Product name");
        String productNmae=input.nextLine();

        System.out.println("Enter the Price");
        double price=input.nextDouble();

        System.out.println("enter the quantity");
        int quality=input.nextInt();

        System.out.println("enter first name");
        input.nextLine();

        String firstNmae=input.nextLine();
        double totalPrice=price*quality;

        System.out.println(firstNmae+", your order for "+quality+" "+productNmae+" has been places. your total is "+totalPrice);




input.close();
    }



}
