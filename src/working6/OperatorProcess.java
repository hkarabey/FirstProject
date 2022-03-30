package working6;

public class OperatorProcess {
    public static void main(String[] args) {
        int number1=10,
                number2=20;
        char mathOperator='9',
                mathOperator1='*',
                mathOperator2='/',
                mathOperator3='+',
                mathOperator4='-';
        if (mathOperator==mathOperator1){
            System.out.println(number1*number2);
        }
        else if (mathOperator==mathOperator2){
            System.out.println(number1/number2);
        }
        else if (mathOperator==mathOperator3){
            System.out.println(number1+number2);
        }else if (mathOperator==mathOperator4){
            System.out.println(number1-number2);
        }else {
            System.out.println("invalid operator");
        }
    }

}
