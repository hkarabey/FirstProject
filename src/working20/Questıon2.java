package working20;

public class Questıon2 {
    public static void main(String[] args) {
        String[]clasmates={"ali","veli","asss","qwertfd","qsdfv","asdfghgyj","ıjhgv","pkjh","ughbvc","kjhgf"};


        for (String each : clasmates) {


            String reversed="";
        for (int i =each.length()-1; i >= 0; i--) {
            reversed+=each.charAt(i);


        }

            System.out.println(reversed);

        }
    }

}
