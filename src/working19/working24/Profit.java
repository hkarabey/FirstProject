package working19.working24;

import java.util.Scanner;

public class Profit {
    public static String clean (String text, String badWord) {

        for(int i=0;i<=text.length()-badWord.length();i++){
            if(text.substring(i,i+badWord.length()).equals(badWord)){
                text=text.replace(badWord,"");
            }
        }
        return text;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }


}
