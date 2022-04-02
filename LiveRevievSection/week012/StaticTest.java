package week012;

public class StaticTest {
    public String instanceValue="selenıum";
    public static String word="java";

    public static void main(String[] args) {

        System.out.println(word);

        StaticMethods.display("hello");
        StaticMethods objects=new StaticMethods();
        objects.display("hello ı am using but a little different or hard");

        System.out.println(StaticMethods.count);
        System.out.println(objects.count);


    }



}
