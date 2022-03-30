package week008;

public class ArrayLooopWithCondition {

    public static void main(String[] args) {
        // amazon website search results for a product
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        for (double eachPrice : prices) {
            System.out.println("each price: "+eachPrice);

        }
        System.out.println("----------------");
        for (double price : prices) {
if(price>100){
    System.out.println("price: "+price);
}
        }
        System.out.println("---------------");

        for (double price : prices) {
            if(price>=10&&price<=70){
                System.out.println("price: "+price);
            }
        }
        System.out.println("---------------");

        int count=0;

        for (double price : prices) {
            if(price>50){
                count++;
            }

        }
        System.out.println("count of price more than50:"+count);
    }

}
