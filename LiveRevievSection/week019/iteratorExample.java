package week019;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class iteratorExample {

    public static void main(String[] args) {

        Set<Integer>set1=new HashSet<>();
        set1.addAll(Arrays.asList(1,2,3,4,6,3,9,7));
        System.out.println(set1);

        Iterator<Integer>it= set1.iterator();

        while (it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }

        System.out.println(set1);


    }

}
