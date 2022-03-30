package week03;

public class RemainderPractice {
    public static void main(String[] args) {
        //input is some amount of seconds(45000)
        //hours mınutes seconds
        int inputSeconds=400;
        int hours,minutes,seconds;
        seconds=inputSeconds%60;
        minutes=(inputSeconds/60)%60;
        hours=inputSeconds/3600;
        System.out.println(hours+":"+minutes+":"+seconds);



    }



}
