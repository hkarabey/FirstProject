package working14;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Write two words");
        String word1=scan.next();
        String word2=scan.next();

        System.out.println(word1.substring(1)+word2.substring(1));




scan.close();
    }


}
