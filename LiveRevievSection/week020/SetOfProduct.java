package week020;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOfProduct {

    public static void main(String[] args) {

        Set<Product>product=new HashSet<>();

        product.add(new Product("car",1_250_000));
        product.add(new Product("book",25));
        product.add(new Product("newspaper",5));

        System.out.println(product);
        for (Product each: product){
            System.out.println("each.getPrice = " + each.getPrice());
            if (each.getName().equals("car")){
                each.setName("my audi");
            }
        }
        System.out.println(product);




    }


}
