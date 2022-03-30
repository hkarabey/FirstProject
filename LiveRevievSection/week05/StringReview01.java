package week05;

public class StringReview01 {
    public static void main(String[] args) {
        String str1="java";//literal way of creation
        //string is created in heap memory there is a
        //special place called string pool
        String str2="java";
        System.out.println(str1==str2);
        //str1 str2 references are the samerefereces are paıntıng the same object
        String str3=new String("java");// ıt ıs out of string pool
        System.out.println(str1==str3);
        //what does equals method do?
        /*
        it is checking for the value of the oject
        */
        System.out.println((str2.equals(str3)));


    }



}
