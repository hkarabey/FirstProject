package working28;

import java.util.ArrayList;
import java.util.Arrays;

public class MultıpleOdd {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer>result=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2!=0){
                result.add(list.get(i)*2);
            }
            else{
                result.add(list.get(i));
            }
        }


        System.out.println(result);
    }


}
