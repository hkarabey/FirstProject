package week019;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Second {

    public static void main(String[] args) {


        Queue<String>cities=new ArrayDeque<>();
        cities.addAll(Arrays.asList("ankara","washington dc","paris","atina"));

        for (int i = 0; i < cities.size(); ) {

            //fifo
            System.out.println("cities.poll() = " + cities.poll());

        }
        System.out.println("cities.size() = " + cities.size());


        Queue<String>cities1=new ArrayDeque<>();
        cities1.addAll(Arrays.asList("ankara","washington dc","paris","atina"));

        for (int i = 0; i < cities1.size(); i++) {
            System.out.println("cities1.peek() = " + cities1.peek());

        }
        System.out.println("cities1.size() = " + cities1.size());

        System.out.println("------------");

        Queue <Integer>list4=new LinkedList<>();
        list4.add(10);
        list4.addAll(Arrays.asList(10,20,30,40));

        ((LinkedList<Integer>)list4).addFirst(1);
        ((LinkedList<Integer>)list4).addLast(100);

        System.out.println(list4);

        ((LinkedList<Integer>)list4).poll();
        System.out.println(list4);

        ((LinkedList<Integer>)list4).poll();
        System.out.println("list4 = " + list4);

        System.out.println("-------------");

        for (int i = 0; i < cities1.size(); ) {
            System.out.println("cities1.poll() = " + cities1.poll());
        }
        System.out.println("cities1.size() = " + cities1.size());

    }



}
