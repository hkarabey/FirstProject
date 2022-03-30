package week04;

public class Ternary {
    public static void main(String[] args) {
        int score1=25;
        String result1="";
        if (score1>60){
            result1="pass";
        }else {
            result1="fail";
        }
        System.out.println(result1);


        System.out.println("-----------");


        int score2=65;
        String result2=(score2>=65)?"pass":"fail";
        System.out.println(result2);
    }



}
