package week019;

import java.util.*;

public class CollectionFrameWork {

    public static void main(String[] args) {

        List<String>list=new ArrayList<>();

        ArrayList<String>arrayList=new ArrayList<>();

        List<String>list1=new Stack<>();

        list.add("mike");
        list.add("oscar");
        list.addAll(Arrays.asList("selena","alexandra",null,null));
        list.add("oscar");
        System.out.println("list = " + list);

        list1.addAll(list);
        System.out.println("list1 = " + list1);

        String str= ((Stack<String>)list1).peek();
        System.out.println("str = " + str);

        str=((Stack<String>)list1).pop();
        System.out.println(str);
        System.out.println(list1);

        ((Stack<String>) list1).push("oscar");
        System.out.println(list1);

        List<Integer>list3=new Stack<>();
        list3.addAll(Arrays.asList(23,4,56,7,89,0,13));
        Collections.sort(list3);
        System.out.println(list3);

        for (int i = 0; i < list3.size(); i++) {

            int x=list3.get(i);
            System.out.println(x);
        }



    }



}
