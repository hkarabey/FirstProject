package working33;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman,hasNose,hasWashing;
    public static byte numberOfHead,numberOfEyes;

    static {
        isHuman=true;
        hasNose=true;
        hasWashing=true;
        numberOfEyes=2;
        numberOfHead=1;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name+" eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name  +
                ", age=" + age +
                ", gender=" + gender +
                ", isHuman=" + isHuman +
                ", hasNose=" + hasNose +
                ", hasWashing=" + hasWashing +
                ", numberOfEyes=" + numberOfEyes +
                ", numberOfHead=" +numberOfHead+
                '}';
    }
}
