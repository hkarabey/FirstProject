package week03;

public class Grader {
    public static void main(String[] args) {
        int n = 71;
        boolean a = n >= 90 && n <= 100,
                b = n >= 80 && n <= 89,
                c = n <= 79;
        if (a) {
            System.out.println("A");
        } else if (b) {
            System.out.println("B");
        } else {
            System.out.println("F");
        }

    }


}
