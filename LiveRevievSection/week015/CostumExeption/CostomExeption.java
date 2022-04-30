package week015.CostumExeption;

public class CostomExeption {

    public static void main(String[] args) {

        int minutes=30;
        System.out.println("class is going on for "+ minutes);
        if (minutes>50){
            throw new BreakTimeException("it is break time exception");
        }
        double balance=395.0;
        double itemPrice=500.0;
        System.out.println("I have "+balance+" euro in my count the item is "+itemPrice);
    if (itemPrice>balance){

        throw new InsufficientBalanceException( "transection declined due to ınsufficient balance hold");
    }

    }


}
