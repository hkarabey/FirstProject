package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {

    /*
    charAt()
    lenght()
    replace()
    replaceFirst()
    trim()
    substring()
    lastIndexOf()
    equals()
    contains()
    isEmpty()
    isBlank()
    toUpperCase()
    toLowerCase()

     * 1.Given a string, print the string made of its first two chars,
     * so the String "Hello" yields “HE".
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("write a word");
        String str=input.nextLine();
        System.out.println("your words' first two letters are = " + str.toUpperCase().substring(0, 2));

        System.out.println(firstTwoChar3(str));

    }
public static String firstTwoChar3(String str){

        str=str.toUpperCase();
        String s=""+str.charAt(0)+str.charAt(1);
        return s;
}
public static String firstTwochar4(String str){
       char[]charArr=str.toCharArray();
    ArrayList<Character>list=new ArrayList<>();
    for (Character each : charArr) {
        list.add(each);
    }
return ""+list.get(0)+list.get(1);
}




}
