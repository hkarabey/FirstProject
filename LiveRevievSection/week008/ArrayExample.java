package week008;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int code=200;
        int []codes=new int[8];
        System.out.println(Arrays.toString(codes));
        codes[0]=200;
        codes[1]=100;
        System.out.println(Arrays.toString(codes));

       int []statusCodes={200,201,204,400,403,404,500};
        System.out.println(Arrays.toString(statusCodes));
        int sizeOfArrays=statusCodes.length;

        System.out.println("status code's length: "+statusCodes.length);
String []responseTypes={"ok","goodbye","welcome","class","eee","bbb","ccc"};

        for (int i = 0; i <sizeOfArrays ; i++) {
            String text=statusCodes[i]+" : "+responseTypes[i];
            System.out.println("each status code"+ text);

        }
    }


}
