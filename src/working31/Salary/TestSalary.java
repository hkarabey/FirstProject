package working31.Salary;

import working31.Salary._1SalaryCalculator;

public class TestSalary {

    public static void main(String[] args) {

        _1SalaryCalculator salary=new _1SalaryCalculator(12.0,0.1,0.2,2);
        System.out.println(salary);
        System.out.println(salary.federalTax());
        System.out.println(salary.stateTax());
        System.out.println(salary.salary());
        System.out.println(salary.salaryAfterTax());

    }


}
