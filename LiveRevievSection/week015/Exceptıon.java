package week015;

public class Exceptıon {

    public static void main(String[] args) {

        String word="java";
       // System.out.println(word.substring(0,20));
        //unchecked exception

        try {
            System.out.println(word.substring(0,20));
        }
        catch (IndexOutOfBoundsException o){
            System.out.println(o.getMessage());
// it is writen only this one because exception is catcted
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
            System.out.println("reason is "+e.getMessage());
        }


    }


}
