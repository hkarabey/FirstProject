package working20;

public class Ques3 {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int count = 0;
        for (String each : items) {

            if (!(each.equals("Gloves"))) {
                count++;
            } else {
                System.out.println(count);
            }


if (each.equals("iPad")){
    System.out.println("it contains iPad");

}

        }

        for (int i = 0; i < items.length; i++) {
            String item=items[i];
            double price=prices[i];
            int itemı=itemIDs[i];

            System.out.println(item+price+itemı);

        }



    }
}
