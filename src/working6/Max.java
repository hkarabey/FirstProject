package working6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scan=new Scanner(System.in);
        System.out.println("write a number");
num1=scan.nextInt();
        System.out.println("write another number");
num2=scan.nextInt();
if(num1>num2){
    System.out.println(num1+" is greater than" +num2);
}
else if(num2>num1){
    System.out.println(num2+" is greater than "+num1);
}
else{
    System.out.println(num1+" is equal "+num2);
}
scan.close();
    }
}
