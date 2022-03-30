package week010;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);

        }
        System.out.print(arrayList);

        String str="123";
        System.out.println(str+1);      //1231

        int num=Integer.parseInt((str));
        System.out.println(num+1);      //124

        String price="$25.32";
        price=price.substring(1);

        double priceInDoub=Double.parseDouble(price);
        System.out.println(price);
        double priceInWrapperClas=Double.valueOf(price);//it is integer but ın wrapperClass


        //difference between Integer.parseInt and Integer.valueof(str)

        Integer num2=Integer.valueOf(str);
        System.out.println(num2+1);

        char a='a';
        boolean a1=Character.isDigit(a);
        boolean a2=Character.isLetter(a);

        String str2="a1b2c3";
        //sum of the ıntegers ınside str2

        int sum=0;
        char[] str3=str2.toCharArray();
        for (int i = 0; i <str3.length ; i++) {
            if(Character.isDigit(str3[i])){
                sum+=Integer.parseInt(str3[i]+"");
            }

        }
        System.out.println(sum);
/*
        int sum1=0;
        char[] str4=str2.toCharArray();
        for (int i = 0; i <str3.length ; i++) {
            if(str4[i]>=0&&str4[i]<=9){
                sum1+=Character.;
            }

        }
        System.out.println(sum1);
*/
    }



}
