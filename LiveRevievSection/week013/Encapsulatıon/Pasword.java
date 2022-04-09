package week013.Encapsulatıon;

import working6.Sc;

import java.util.Scanner;

public class Pasword {

    private String pasword;
    public Pasword(){

    }
    Scanner scan=new Scanner(System.in);

    public String getPasword(){
        if (pasword==null){
            System.out.println("pasword is null write a value");
            pasword=scan.next();
        }else {
            System.out.println("it has a value");
        }
        return pasword;
    }



}
