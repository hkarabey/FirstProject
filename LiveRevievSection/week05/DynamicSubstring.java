package week05;

public class DynamicSubstring {
    public static void main(String[] args) {
        String searchResult="result count:12345";
        System.out.println(searchResult.replaceAll("r","?"));
        System.out.println(searchResult.substring(13));
        System.out.println(searchResult.substring(13,searchResult.length()));
        System.out.println(searchResult.indexOf(":"));
        System.out.println(searchResult.substring(searchResult.indexOf(":")+1));
        String newSearchEResult=searchResult.substring(searchResult.indexOf(":")+1);
        System.out.println(newSearchEResult);
        String a="halil:studetn password is:1234";
        int firstColon=a.indexOf(":");
        int lastColon=a.lastIndexOf(":");
        System.out.println(firstColon+","+lastColon);

String s=a.substring(a.indexOf(":")+1);
        System.out.println(s.indexOf(":")+a.indexOf(":")+1);

        String today="I coded a lot of [java] today";

        String newToday=today.substring(today.indexOf("[")+1,today.indexOf("]"));
        System.out.println(newToday);





    }


}
