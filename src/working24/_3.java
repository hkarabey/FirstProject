package working24;

public class _3 {
    public static void main(String[] args) {

String str="anna";
        System.out.println("reverse(str) = " + reverse(str));
        System.out.println("palindrom(str) = " + palindrom(str));

    }
    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i>=0  ; i--) {
            result+=str.charAt(i);

        }
        return result;
    }
    public static boolean palindrom(String str){
        reverse(str);
        if (str.equals(reverse(str))){
            return true;
        }else {
            return false;
        }

    }

}
