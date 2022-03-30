package working13;

import java.util.Scanner;

public class ThreeLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write a three letters word ");
String word=scan.next();
int LenghtOfWord=word.length();
if (LenghtOfWord==3){
    if (word.charAt(1)=='a'){
        System.out.println("cool word");
    }else {
        System.out.println("okay word");
    }
}else if (LenghtOfWord<3){
    System.out.println("word is too short");
}
else{
    System.out.println("word is too long");
}

scan.close();
    }



}
