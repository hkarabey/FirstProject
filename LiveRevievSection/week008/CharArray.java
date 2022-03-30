package week008;

import java.util.Arrays;

public class CharArray {

    public static void main(String[] args) {

        char[]letters={'j','a','v','a','i','s','f','u','n'};
        System.out.println(Arrays.toString(letters));

        for (char letter : letters) {
            System.out.print(letter+" ");

        }
String sentece=new String(letters);
        System.out.println(sentece);
        char []newArray=sentece.toCharArray();
        for (char c : newArray) {
            System.out.print(c);

        }


    }


}
