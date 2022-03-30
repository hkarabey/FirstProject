package week04;

public class Nestedİf {
    public static void main(String[] args) {
        boolean rushHour=false;
        int carType=2;//1~~~6
        double price=0.0;

        if (carType==1){
            if (rushHour){
                price=30.0;
            }else {
                price=5.0;
            }
        }else if (carType==2){
            if (rushHour){
                price=55.3;
            }else {
                price=15.99;
            }
        }
        System.out.println(price);
    }


}
