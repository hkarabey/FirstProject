package week012;

public class StaticMethods {
    public int num=10;

    public static int count=5;

    public static void display(String message){
        System.out.println("message "+message);
        System.out.println(count);
        //System.out.println(num); because num is not static

    }
    public void instanceMethod(){
        System.out.println(num);

        System.out.println(count);// we can call statıc via instance method

        display("hello word");
    }





}
