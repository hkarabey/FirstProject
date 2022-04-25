package working35.Square;

public class Square {
    private int side;

    public void setSide(int side){
       if (side<0){
           throw new RuntimeException("side cannot be negative");
       }
        this.side=side;

    }
public int getSide(){
        return side;
}

    public Square(int side) {
        setSide(side);
    }

    public int area(){
        return getSide()*getSide();
    }
    public int calcPerimeter(){
        return 4*getSide();
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + area() +
                "perimete=" + calcPerimeter() +
                '}';
    }
}
