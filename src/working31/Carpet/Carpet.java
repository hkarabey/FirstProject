package working31.Carpet;

public class Carpet {

    public int width;
    public int length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        if(isPersian==false) {
            return unitPrice * width * length;
        }else return unitPrice * width * length+200;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}
