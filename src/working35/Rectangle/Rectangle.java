package working35.Rectangle;

public class Rectangle {

    private int width,length;

    public void setWidth(int width) {
        if (width<0)
            throw new RuntimeException("it not should be negative");
        this.width = width;
    }

    public void setLength(int length) {
        if (length<0)
            throw new RuntimeException("it not should be negative");
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Rectangle(int width, int length) {
      setLength(length);
        setWidth(width);
    }

    public int area(){
        return width*length;
    }
    public int perimeter(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
