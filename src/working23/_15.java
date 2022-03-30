package working23;

public class _15 {
    public static void main(String[] args) {
      calculator(12,3,'+');




    }
    public static void calculator(int n1,int n2,char operator){
        if (operator=='+'){
            System.out.println(n1+n2);
        }else if (operator=='-'){
            System.out.println(n1-n2);
        }else if (operator=='*'){
            System.out.println(n1*n2);
        }else if (operator=='/'){
            System.out.println(n1/n2);
        }
    }


}
