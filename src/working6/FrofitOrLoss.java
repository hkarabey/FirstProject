package working6;

import java.util.Scanner;

public class FrofitOrLoss {
    public static void main(String[] args) {
        int buy,sell;
        Scanner scan=new Scanner(System.in);
        System.out.println("write your good's buyying price");
        buy=scan.nextInt();
        System.out.println("write your good's selling price");


        sell=scan.nextInt();
        if(buy<=sell){
            System.out.println("good is profit");
        }
        else{
            System.out.println("good is loss");
        }
        scan.close();
    }





}
