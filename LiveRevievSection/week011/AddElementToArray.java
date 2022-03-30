package week011;

import java.util.Arrays;

public class AddElementToArray {

    public static String[] addElement(String[]list,String str){
        String[]newAdded=new String[list.length+1];
        for (int i = 0,j=0; i < list.length; i++,j++) {
            newAdded[j]=list[i];

        }
        newAdded[newAdded.length-1]=str;

        return newAdded;
    }

    public static void main(String[] args) {
        String []add={"ali","veli"};
        String str="kırkdokuz";
        String []a=addElement(add,str);
        System.out.println(Arrays.toString(a));
    }


}
