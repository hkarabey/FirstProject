package working07;

import working01.İf;

public class Grade {
    public static void main(String[] args) {
       char grade='A';
        if (grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F'){
            if (grade=='A'){
                System.out.println("exellent");
            }else if (grade=='B'){
                System.out.println("great job");
            }else if (grade=='C'){
                System.out.println("good");
            }else if (grade=='D'){
                System.out.println("passed");
            }else {
                System.out.println("failed");
            }
        }else{
            System.out.println("invalid grade");
        }
    }


}
