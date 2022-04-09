package week02;

public class CustomMethodExample {
    public static void main(String[] args) {
        System.out.println("add(12,13) = " + add(12, 13));
        System.out.println("add(12.30,13.33) = " + add(12.3, 13.33));


    }
public static int add(int x, int y){

        return x+y;
}
    public static double add(double x, double y){

        return x+y;
    }


}
