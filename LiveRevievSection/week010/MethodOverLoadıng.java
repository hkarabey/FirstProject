package week010;

public class MethodOverLoadıng {

    //ı will as a parameter either inches or ınches and feet get togather
    //return value of centimeters

    public static void main(String[] args) {
        //height of somebody=5 feet&11 ınches
        System.out.println(convertBiritishToMetric(5,11));
        System.out.println(convertBiritishToMetric(55));
        String str="java is fun";
        System.out.println(str.substring(3,5));
        System.out.println(str.substring(3));

    }
    public static double convertBiritishToMetric(double feet,double inches){
        //1 feet =12 inches
        if ((feet<0 || inches<0 || inches>12)){
            System.err.println("invalid feet or ınches");
            return -1;
        }

        return feet*12*2.54+inches*2.54;
    }
    public static double convertBiritishToMetric(double inches){
        if (inches<0){
            System.err.println("invalid feet");
            return -1.0;
        }
        return inches*2.54;

    }
    /*
    public static int convertBiritishToMetric(double x,double y)
*/
}

