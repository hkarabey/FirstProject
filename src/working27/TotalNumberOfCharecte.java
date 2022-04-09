package working27;

public class TotalNumberOfCharecte {
    public static void main(String[] args) {

        String str="JAVA java";
        char[]ch=str.toCharArray();
        int low=0;
        int up=0;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLowerCase(ch[i])){
                low++;
            }
            if (Character.isUpperCase(ch[i])){
                up++;
            }
        }
        if (up==low){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }


}
