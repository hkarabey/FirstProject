package week018;

public class SuperManTest {
    public static void main(String[] args) {


        Parent superManOne = new Father();
        superManOne.feedKid();
        superManOne.playWithKid();
        superManOne.raiseKid();

        Worker superManTwo = new Father();
        superManTwo.getPaid();
        superManTwo.work("sdet");


        Father superManThree=new Father();

        boolean b1=superManOne instanceof Worker;
        boolean b2=superManTwo instanceof Father;
        boolean b3=superManThree instanceof Father;
        System.out.println("b3 = " + b3);
        System.out.println("b2 = " + b2);
        System.out.println("b1 = " + b1);

        ((Worker)superManOne).work("sdet");

    }

}
