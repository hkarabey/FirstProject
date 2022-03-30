package week007;

public class ExampleWhileHungry {
    public static void main(String[] args) {
boolean isHungary=true;
int bananas=0;
int countToFull=3;
while (isHungary){
    bananas++;
    System.out.println("eating a banana:\uD83C\uDF4C "+bananas);
    if (bananas==countToFull){
        isHungary=false;
    }
}

        System.out.println("had enough bananas lets get back to study");

    }



}
