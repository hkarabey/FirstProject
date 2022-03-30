package working07;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
       byte age=0;
        System.out.println("write your age");
       Scanner scan=new Scanner(System.in);
       age=scan.nextByte();

        if (age>=1&&age<=18){
            if (age>=1&&age<=5){
                System.out.println("elementary school");
            }else if (age>=6&&age<=8){
                System.out.println("middle school");
            }else if (age>=9&&age<=12){
                System.out.println("high school");
            }else if (age>=13&&age<=16){
                System.out.println("college");
            }else {
                System.out.println("grad school");
            }
        }else{
            System.out.println("invalid age");
        }



    }


}
