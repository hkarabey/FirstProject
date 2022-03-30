package working01;

public class AritmetikOperators {
    public static void main(String[] args) {
        String s="ı love"+" you";

        System.out.println("12"+"+"+"5"+"="+"17");
        System.out.println("12+5=17");
        String yaz = "ı love study";
        System.out.println(yaz);
/*
++a, a++ bir sonraki
arıtmetik o2 de anlatıldı
 */
        int top=100+200;
        System.out.println(top);

        int a=100;
        int b=200;
        System.out.println(a+b);

        int incre =10;
        incre = ++incre;
        System.out.println(incre);

        int incr =10;
        incr = incr++;
        int x = ++incr;
        System.out.println(incr);

        int y = x++;
        System.out.println(x);
        System.out.println(y);


    }



}
