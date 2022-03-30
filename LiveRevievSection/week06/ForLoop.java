package week06;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {   //i is local variable
            System.out.print(i*10+" ");
            //int i = 0;    -->initialization
            //i <= 100;     -->condition
            //i++           -->iteration




        }
        System.out.println();
        System.out.println("-----------");
        int z=0;                //z is whole variable global
        for ( ;z <= 100; ) {
            System.out.print(z*10+" ");
            z++;
        }

    }







}
