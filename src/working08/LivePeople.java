package working08;

import java.util.Scanner;

public class LivePeople {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        System.out.println("how many people live with you");
        int people=scan.nextInt();
        if(people>=0){
        if(people<3){
            System.out.println("live with less than 3 people");
        }else if (people>=3&&people<=6){
            System.out.println("live with 3-6 people");
        }else {
            System.out.println("live with more than 6 people");
        }}
        else{
            System.out.println("invalid");
        }
scan.close();


    }



}
