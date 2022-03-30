package working19.working24;

public class FibonacciReplit2 {

    public static void main(String[] args) {

int a=fib(1);
        System.out.println(a);
    }

    public static int fib(int num) {
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        int num1 = 0;
        int num2 = 1;
        int temp;
       for (int i = 2; i <= num; i++) {
            temp = num2;
            num2 = num2 + num1;
            num1 = temp;


        }

        return num2;
    }

}
