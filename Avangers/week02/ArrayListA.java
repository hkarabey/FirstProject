package week02;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListA {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("london");
        cities.add("denver");
        cities.add("paris");
        System.out.println(cities);

        cities.add(1, "istanbul");
        System.out.println(cities);

        System.out.println("--------------");
        System.out.println(cities.get(2));
        System.out.println(cities.get(0));

        System.out.println("--------------");

        cities.set(0,"newyork");
        System.out.println(cities);

        System.out.println("--------------");

        int indexOfParis=cities.indexOf("paris");
        int lastİndexOfParis=cities.lastIndexOf("paris");

        if (indexOfParis==lastİndexOfParis){
            System.out.println("paris is unique");
        }

        System.out.println(cities.size());

        System.out.println("----------");
        if (cities.contains("istanbul")){
            System.out.println("istanbulu içeriyor");
        }
        System.out.println("---------");
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.addAll(Arrays.asList(10,20,30,40,50,60));

        arrayList.remove(3);
        System.out.println(arrayList);
        System.out.println("----------");

        arrayList.addAll(Arrays.asList(20,20,20));
        arrayList.retainAll(Arrays.asList(20));
        System.out.println(arrayList);

        System.out.println("-------------");
        arrayList.removeIf(p->p==20);
        System.out.println("arrayList.size() = " + arrayList.size());

    }
}
