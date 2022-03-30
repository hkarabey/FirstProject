package week008;

public class ReportMaxPrice {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

double maxPrice=prices[0];
int indexOfMaxPrice=1;
        for (int i = 0; i < prices.length; i++) {
            if (maxPrice<prices[i]){
                maxPrice=prices[i];
                indexOfMaxPrice=i;
                System.out.println(i);
                System.out.println("maxPrice = " + maxPrice+" item is: "+items[i]);
            }

        }
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println("maxPrice = " + maxPrice);




    }


}
