package week009;

public class CustomMethodPractıce {
    public static void main(String[] args) {
        int person1Age=10;
        if (person1Age>=21){
            System.out.println("eligible");
        }else {
            System.out.println("no eligible");
        }
int person2Age=20;
        if (person2Age>=21){
            System.out.println("eligible");
        }else {
            System.out.println("no eligible");
        }
        int person3Age=30;
        if (person3Age>=0){
            System.out.println("eligible");
        }else {
            System.out.println("no eligible");
        }
        System.out.println("----");
        eligibleOrNot(person1Age);
        eligibleOrNot(person2Age);
        eligibleOrNot(person3Age);
        eligibleOrNot(43);
    }



public static void eligibleOrNot(int age){

        if (age>=21){
            System.out.println("eligible");
        }else{
            System.out.println("no eligible");
        }
}


}
