package week06;

public class EvenNumber {
    public static void main(String[] args) {
        int count =0;
        for (int i = 5; i <=50 ; i++) {
            if (i%2==0){
                count+=1;
            }
        }
        System.out.println(count);

    }


}
