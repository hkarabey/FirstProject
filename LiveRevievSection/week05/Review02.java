package week05;

import java.util.Locale;

public class Review02 {
    public static void main(String[] args) {

        //length

        String message="eu8 is awesome!!";

        int len=message.length();
        System.out.println(message+"how many character we have : "+len);
        System.out.println(len==16);

        //toUpperCase


        System.out.println(message.toUpperCase());
        System.out.println(message);
message=message.toUpperCase();
        System.out.println(message);

        //trim

        String str="  ab c ";
        System.out.println(str.trim());

        System.out.println(message.substring(0,1).toLowerCase()+message.substring(1).toUpperCase());

        //replace

        String str2="abc def";
       str2 =str2.replace(" ","");
        System.out.println(str2);
        String str3="   EU8 Avesome ";
        str3=str3.trim().replaceFirst(" ","");
        System.out.println(str3);

    }


}
