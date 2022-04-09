package working28;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,4,5,6,6,7,8,8,9));

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)== list.get(i+1)){
                System.out.println(list.get(i));
                break;
            }

        }



    }


}
