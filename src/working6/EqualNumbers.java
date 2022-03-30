package working6;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1=12,
                n2=14,
                n3=14;

        if (n1==n2&&n1==n3){
            System.out.println("all equal");
        }else if (n1==n2 && n1!=n3){
            System.out.println("n1&n2 are equal");
        }
        else if (n2==n3&&n2!=n1){
            System.out.println("n2&n3 are equal");
        }else if (n3==n1&&n3!=n2){
            System.out.println("n3& n1 are aqual");
        }else if (n1!=n2&&n2!=n3){
            System.out.println("none of them are equal");
        }

    }





}
