package week03;

public class LogicalOperators {
    public static void main(String[] args) {

        int i1=5,
                i2=10;
        System.out.println(true|false);
        System.out.println(false||true);
        System.out.println(i2>i1||++i1>i2);//second part does not check
        System.out.println("i1= "+i1);
    }

}
