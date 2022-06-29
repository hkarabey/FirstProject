package week020;

public class CalculatorTest {
    public static void main(String[] args) {


        Floor floorlivingRoom = new Floor(4, 7);
        Carpet carpetFirst = new Carpet(2000);
        Calculator calculator = new Calculator(floorlivingRoom, carpetFirst);

        System.out.println("calculator.getTotalCost() = " + calculator.getTotalCost());

        calculator=new Calculator(new Floor(3,3),new Carpet(1900));
        System.out.println("calculator.getTotalCost() = " + calculator.getTotalCost());


    }

}
