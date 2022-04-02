package week012;

public class Employee {

    /*
    Employee:
    attribute
        name, jobTitle, ID, salary

    add a constructor to initialize all the fields

    toString()

#class-chat kanalına mesaj gönder

     */
 public String name;
 public String jobTitle;
 public int ID;
 public double salary;

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }
}
