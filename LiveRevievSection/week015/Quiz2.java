package week015;

public class Quiz2 {
    static int a=50;

    public static void main(String[] args) {

        a=100;
        try {
            a=200;
        }catch (Exception e) {
            a = 300;
        }
        System.out.println(a);
    }
    static {
        a=500;
    }

}
