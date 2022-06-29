package week015;

public class Quiz {
    public static void main(String[] args) {

/*
        try {
            throw new ArithmeticException();
        }catch (NullPointerException e){
            System.out.println("nul");
        }catch (RuntimeException e){
            System.out.println("run");
        }catch (ArithmeticException e){
            System.out.println("AR");
        }
*/

        pause1();
        //pause2();


    }
public static void pause1(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
}
public static void pause2()throws InterruptedException{
        Thread.sleep(3000);
}
}
