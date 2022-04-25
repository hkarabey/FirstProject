package working33;

public class CircleTest {

public int radius,diameter;

public static double pi;

static {
    pi=3.14;
}

    public CircleTest(int radius) {
        this.radius = radius;
    }

    public double calArea(){

    return pi*radius*radius;
    }
    public double calPerimeter(){
    return 2*pi*radius;
    }
    public static void printPi(){
        System.out.println(pi);
    }

    public String toString() {
        return "CircleTest{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calArea() +
                ", perimeter=" + calPerimeter() +
                '}';
    }
}
