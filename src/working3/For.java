package working3;

public class For {
    public static void main(String[] args) {
        for(int i=1;i<=100;i+=1){

            if(i%15==0){
                System.out.println("fizzbuzz");
            }
            else if(i%5==0){
                System.out.println("buzz");
            }
            else if(i%3==0){
                System.out.println("fizz");
            }
            else{
                System.out.println(i);
            }

        }



    }



}
