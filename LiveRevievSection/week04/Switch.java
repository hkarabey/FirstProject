package week04;

public class Switch {
    public static void main(String[] args) {
        int numberOfStatement=2;
        switch (numberOfStatement){
            case 0:
                System.out.println("Studio apartment selected\nstartingPrice -> 1454");
                break;
            case 1:
                System.out.println("One bedroom apartment selected\nstartingPrice -> 1725");
                break;
            case 2:
                System.out.println("Two bedroom apartment selected\nstartingPrice -> 2899");
                break;
            default:
                System.out.println(numberOfStatement+" bedroom currently unavailable");
                break;
        }



    }


}
