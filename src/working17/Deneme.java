package working17;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        String ta="A";
        ta=ta.concat("B ");
        String tb="C";
        ta=ta+tb;
       String tc=ta.replace("C","d");
        System.out.println(tc);
        ta=ta+tb;
        System.out.println(ta);
        String S1="ABC";
        String S2="ABC";
        System.out.println("s1==s2: "+S1==S2);

    }
}
