package week008;

public class ShoopingAppTest {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        System.out.println("-------find the first indexof Gloves-----------");

        int index=0;

        for (int i = 0; i < items.length; i++) {

            if(items[i].equals("Gloves")){
                System.out.println(index);
            }else{
                index++;
            }
        }

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("gloves")){
                System.out.println(i);
                break;
            }

        }
        System.out.println("------blooan-------");

        boolean ipadExist=false;
        for (String item : items) {
            if (item.equalsIgnoreCase("ipad")){
                ipadExist=true;
                break;
            }

        }
        if (ipadExist)
            System.out.println("we have ipad in the list");
        else
            System.out.println("ıpad no exist in the list");
        System.out.println("---------jacket -----------");
        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase("jacket")){
                String itemDetail=items[i]+"$"+prices[i]+"#"+itemIDs[i];
                System.out.println(itemDetail);
            }


        }

    }
    }

