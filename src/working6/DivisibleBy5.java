package working6;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        int num;
        System.out.println("Write a number");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        if(num%55==0){
            System.out.println(num+" is divided by 5 and 11");
        }
        else{
            System.out.println(num+ " is not divided by 5 and 11");
        }



    }


}
