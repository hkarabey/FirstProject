package working07;

public class Loan {
    public static void main(String[] args) {
      int salary=60_000,creditScore=250;
        String a=(salary>=65000&&creditScore>=300)?"loan aproved":"loan denied";
        System.out.println(a);

    }

}
