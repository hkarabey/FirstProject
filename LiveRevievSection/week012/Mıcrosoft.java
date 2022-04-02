package week012;

public class Mıcrosoft {
    public static void main(String[] args) {

        String []arr={"ab","cv","ed","gf"};
        Employee[]testers={
                new Employee("halil","sdet",123,121),
                new Employee("ahmet","sdet",12122,12113),
                new Employee("ceylan","sdet",12,2111)
        };

        double maxSalary=Double.MIN_VALUE;
        for (Employee each: testers){
            if (each.salary>maxSalary)
                maxSalary= each.salary;
        }
        System.out.println("max salary is: "+maxSalary);

    }



}
