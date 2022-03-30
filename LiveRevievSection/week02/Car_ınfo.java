package week02;

public class Car_ınfo {
    public static void main(String[] args) {
        /*
        ı want to give example
        of the car that you will buy
        after you find a well payed job
         */
        int year=2022;
        String make="Audi";
        String model="A6";
        //outomatic =true;manuel=false
        boolean aotomatic=true;
        String color="white";
        int milage=0;
        int price=100_000;//for euro
        System.out.println(year+"   "+make+"  "+model+"\n"
        +"aotomatic:"+aotomatic);
        System.out.println(color+"  "+milage+"  "+price);
// let us turn this value into tl
        double pricetl= price*15.5;
double tax=1.80;
double priceaftertaxtl=pricetl+(pricetl*tax);
        System.out.println("priceaftertaxtl = " + priceaftertaxtl);

        System.out.println("tax = " + tax);
        int num1=1200;
        byte num2=12;
      num2= (byte) num1;





    }


}
