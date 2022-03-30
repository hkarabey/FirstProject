package working6;

public class CampusTime {
    public static void main(String[] args) {
        int time=8;
if (time>=8&&time<=23){
    System.out.println("open");
}else if(time>=0&&time<8||time==24){
    System.out.println("close");
}else{
    System.out.println("give a valid time");
}

    }
}
