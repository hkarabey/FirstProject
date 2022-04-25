package working33.Student;

public class Student {

    public String name;
    public int age;
    public char gender;
    public int ID;
    public char grade;
    public String batchNumber;
    public int groupNumber;

    public static String schoolNmane;
public static String proğrammingLnaguage;


    public Student(String name, int age, char gender, int ID, char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void stduy(){
        System.out.println(name+" is stduying in "+schoolNmane+" for "+proğrammingLnaguage);
    }
    public void attendClass(){
        System.out.println(name+ " attending "+ batchNumber);
    }
    public static void printschoolNmae(){
        System.out.println(schoolNmane);
    }
    public static void printProgrammıngLanguage (){
        System.out.println(proğrammingLnaguage);

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
