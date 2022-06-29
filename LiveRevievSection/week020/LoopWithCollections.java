package week020;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopWithCollections {

    public static void main(String[] args) {

        List<Carpet>carpets=new ArrayList<>();
        carpets.add(new Carpet(50));
        carpets.add(new Carpet(100));
        carpets.add(new Carpet(150));
        carpets.add(new Carpet(200));

        for (Carpet eachCarpet : carpets) {
            System.out.println("eachCarpet = " + eachCarpet.getCost());
        }
        for (int i=0;i<carpets.size();i++){
            System.out.println("carpets = " + carpets.get(i).getCost());

        }

        Iterator <Carpet>it=carpets.iterator();

        while (it.hasNext()){
            double cost=it.next().getCost();
            System.out.println(cost);
        }


    }


}
