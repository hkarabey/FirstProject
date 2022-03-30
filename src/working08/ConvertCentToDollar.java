package working08;

import java.util.Scanner;

public class ConvertCentToDollar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write your cents");
        int cents1= input.nextInt();
        int dollars=cents1/100;
        int cents=cents1%100;
        System.out.println(cents+ " cent equals to: "+dollars+" dollars and "+cents+" cents");


input.close();

    }




}
