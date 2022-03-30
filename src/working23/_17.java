package working23;

import java.util.Arrays;
import java.util.Locale;

public class _17 {

    public static void main(String[] args) {
anagram("listen","Listne");
    }

    public static void anagram(String w1,String w2){
        char[]w11=w1.toLowerCase().toCharArray();
        char[]w21=w2.toLowerCase().toCharArray();
        Arrays.sort(w11);
        Arrays.sort(w21);
        if (Arrays.equals(w11,w21)){
            System.out.println("anagram");
        }


    }


}
