package working14;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result= "nothing";
        if (str.indexOf("bread")<str.lastIndexOf("bread")){result=str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));}
        System.out.println(result);

    }
     }


