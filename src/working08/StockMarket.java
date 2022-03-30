package working08;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("how many total shares they have already");
        int totalShares=input.nextInt();
        System.out.println("how much their total value in the stock market is");
        double totalValue=input.nextDouble();
        input.nextLine();

        System.out.println("enter the name of the company");
        String nameOfCompany=input.nextLine();
        if(totalShares>0){
            System.out.println("your stock market holdıng is $ "+totalValue+" which is made up of "+totalShares+" shares. "+nameOfCompany+" is your company holding");
        }
        else{
            System.out.println("invalid total share");
        }

input.close();
    }



}
