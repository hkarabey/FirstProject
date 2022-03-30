package week011;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;

public class SomeUsefulMethod {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
       // list.remove(1);
      list.removeIf(p->p==1);
        System.out.println("list = " + list);


        list.remove(Integer.valueOf(1));
        System.out.println(list);

        //array to Arraylist or arraylist to array

        String []array={"red","white","yellow"};
        ArrayList<String >listTwo=new ArrayList<>(Arrays.asList(array));
        System.out.println(listTwo);

        String [] arrayTwo=new String[listTwo.size()];
        listTwo.toArray(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));

        int[]arrayThree={1,2,3,4}; //it is not wrapper class. so we do not  add directly
        ArrayList<Integer>listThree=new ArrayList<>();

        for (Integer each:arrayThree){
            listThree.add(each);
        }
        System.out.println(listThree);
    }


}
