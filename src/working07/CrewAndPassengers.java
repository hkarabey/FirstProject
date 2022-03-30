package working07;

import java.util.Scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int total=0;
        System.out.println("write total person");
        Scanner scan=new Scanner(System.in);
        total=scan.nextInt();
if (total==50||total==75||total==100){
    if (total==50){
        System.out.println("20 crew and 30 passenger");
    }else if (total==75){
        System.out.println("25 crew ad 50 passenger");
    }else{
        System.out.println("30 crew and 70 passenger");
    }
}
else{
    System.out.println("invalid");
}
    }

}
