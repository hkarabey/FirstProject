package working24;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.*;

public class _2 {

    public static void main(String[] args) {
        String s1="abc";
        String s2="bca";
        System.out.println("isAnagram(s1,s2) = " + isAnagram(s1, s2));


    }

    public static boolean isAnagram(String str1, String str2) {

        char[] str1c = str1.toCharArray();
        char[] str2c = str2.toCharArray();
        Arrays.sort(str1c);
        Arrays.sort(str2c);

        if (Arrays.equals(str1c,str2c)) {
            return true;
        } else {
            return false;
        }

    }


}
