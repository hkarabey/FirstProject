package working07;

public class CapuccınoBuyer {
    public static void main(String[] args) {
        String capuccino = "";
        switch (capuccino) {
            case "tall":
                System.out.println("price is $3.69 \n90 calories");
                break;
            case "grande":
                System.out.println("price is $3.99;\n120 calories");
                break;
            case "venti":
                System.out.println("price is $4.29\n150 calories");
                break;
            default:
                System.out.println("invalid");
                break;
        }


    }

}
