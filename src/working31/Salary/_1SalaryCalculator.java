package working31.Salary;

public class _1SalaryCalculator {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;

    public _1SalaryCalculator(double hourlyRate,double stateTaxRate,double federalTaxRate,int weeklyHours){
        this.hourlyRate=hourlyRate;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;
        this.weeklyHours=weeklyHours;
    }

    public double salary(){
        return hourlyRate*weeklyHours*52;
    }
    public double stateTax(){
        return salary()*stateTaxRate;
    }
public double federalTax(){
        return salary()*federalTaxRate;
}
public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
}


    public String toString() {
        return "_1SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }
}
