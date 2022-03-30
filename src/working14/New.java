package working14;

import java.util.Scanner;

public class New {


            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                //WRITE YOUR CODE HERE
                System.out.println("Enter full name:".contains(" " ));

                String fullName=scan.nextLine();

                if (fullName.equalsIgnoreCase("max payne")||fullName.equalsIgnoreCase("alan wake")){
                    System.out.println("User found!");
                }
        }
    }

