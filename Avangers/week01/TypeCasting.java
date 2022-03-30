package week01;

public class TypeCasting {

    /*
    implicit:
    casting done by compiler
    smaller to bigger data type
    no data loss

    explicit casting:
    there is data loss
    done by developer
    NARROWİNG
     */
    public static void main(String[] args) {
        byte b=10;
        short s=b; //implicit casting
        System.out.println(s);

        double d=5.3;
        int i=(int)d; //explicit casting
        System.out.println(i);



    }



}
