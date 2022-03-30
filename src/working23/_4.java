package working23;

public class _4 {
    public static void main(String[] args) {
        eligibleToVote(19,"usa");

    }


    public static void eligibleToVote(int age,String citizen){

        if (age>18&&citizen.equalsIgnoreCase("usa")){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("not eligible");
        }
    }


}
