package week02;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {
        /*
        output goes to console--printor println

         */
        System.out.println("Output");
        //how can ı receive input for
        //my java class
        //1-create your scanner object
        Scanner input=new Scanner(System.in);
        //2-prompt to user for putting input
        System.out.println("put you name: ");
        //3-get the input
        String name="";
        name=input.next();


    }




}
