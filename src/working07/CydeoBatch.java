package working07;

public class CydeoBatch {
    public static void main(String[] args) {
        String batchType="EU";
        if(batchType=="US Morning"||batchType=="US Evening"||batchType=="EU"){
            switch (batchType){
                case "US Morning":
                    System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                    break;
                case "US Evening":
                    System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                    break;
                default:
                    System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
                    break;
            }
        }else{
            System.out.println("invalid");
        }

    }

}
