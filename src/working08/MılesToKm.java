package working08;

import java.util.Scanner;

public class MılesToKm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter miles");
        double miles= input.nextInt();
        double km=miles*1.609;
        System.out.println(miles+ " miles equal to "+km+ " kilometres");

input.close();
    }



}
