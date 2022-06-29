package week020;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public void setWidth(double width) {
        if (width<0){
            throw new RuntimeException("it is not accesible width");
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length<0){
            throw new RuntimeException("it is not valid value");
        }
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
}
