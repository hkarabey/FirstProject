package working20;

import java.util.Arrays;

public class Chara {

    public static void main(String[] args) {

        String str1="abcd";
        String str2="acdb";

        char[]str1c=str1.toCharArray();
        char[]str2c=str2.toCharArray();

        Arrays.sort(str1c);
        Arrays.sort(str2c);

        if (Arrays.equals(str1c,str2c)){
            System.out.println("same");
        }
        System.out.println(str1c.length);
        int count=0;
        for (char c : str1c) {
            count++;

        }
        System.out.println(count);


        String []nas={"ali veli","kırkdouz elli"};

        for (String na : nas) {
            System.out.println(""+na.charAt(0)+na.charAt(na.length()-1));
        }



        int []nı={1,2,3,4,5,6,7,8};
        int[]nırever=new int[nı.length];

        for (int i = nı.length-1,j=0; i >=0; i--,j++) {
            nırever[j]=nı[i];

        }
        System.out.println(Arrays.toString(nırever));

        String aan="ali@cstr.com";
        String[]arr=aan.split("@");
        System.out.println(Arrays.toString(arr));
    }





}
