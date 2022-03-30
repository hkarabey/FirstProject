package working6;

public class OxygenTank {
    public static void main(String[] args) {
int levelNumber=50;
if (levelNumber>90&&levelNumber<=100){
    System.out.println("your tank is full");
}else if (levelNumber<=90&&levelNumber>80){
    System.out.println("still ok");
}else if (levelNumber>70&&levelNumber<=80){
    System.out.println("do not go far away");
}else if(levelNumber<=70&&levelNumber>60){
    System.out.println("start to head back");
}else if (levelNumber<=60&&levelNumber>=50){
    System.out.println("be carefull now you are at%50");
}

    }
}
