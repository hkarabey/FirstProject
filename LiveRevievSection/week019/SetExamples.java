package week019;

import java.util.*;

public class SetExamples {

    public static void main(String[] args) {

        String str="xxxxxaaaabbbbnnnnnnnccccccddeee";
        List<String>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(str.split("")));

        System.out.println("list1 = " + list1);

        Set<String>set1NoDuplicate=new LinkedHashSet<>();
        set1NoDuplicate.addAll(list1);
        System.out.println("set1NoDuplicate = " + set1NoDuplicate);

        set1NoDuplicate.add(null);
        System.out.println("set1NoDuplicate = " + set1NoDuplicate);

        Set<String>set1=new HashSet<>();
        set1.addAll((list1));
        System.out.println("set1 = " + set1);
        set1.add("w");
        System.out.println("set1 = " + set1);
        set1.add(null);
        System.out.println("set1 = " + set1);

        Set<String>set2=new TreeSet<>();
        set2.addAll(list1);
        System.out.println("set2 = " + set2);
        // set2.add(null); null is not comparable
        System.out.println("set2 = " + set2);


    }


}
