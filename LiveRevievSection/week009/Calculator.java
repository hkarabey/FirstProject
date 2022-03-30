package week009;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2,20));
        double sum=add(4,5);

        System.out.println("100*200 is equals to "+multıpy(100,200));

    }
    public static double add(double num1,double num2){
        double result=num1+num2;
        return result;
    }
    public static double substract(double num1, double num2){
        return num1-num2;
    }
    public static double multıpy(double num1,double num2){
        return num1*num2;
    }
    public static double division(double num1,double num2){
        return num1/num2;
    }

}
