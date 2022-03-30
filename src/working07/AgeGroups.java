package working07;

public class AgeGroups {
    public static void main(String[] args) {
       int age=-140;
       if (age>=0&&age<=150){
           if (age<21){
               System.out.println("teeneger");
           }else if (age>=21&&age<55){
               System.out.println("adult");
           }else{
               System.out.println("senior");
           }
       }
       else{
           System.out.println("invalid age");
       }
    }
}
