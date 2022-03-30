package working21;

public class _6 {
    public static void main(String[] args) {
        String word= "java java python python java python";
    String[]wordArr=word.split(" ");

    int countPyt=0;
    int countJva=0;

    for (int i=0;i<wordArr.length;i++){
        if (wordArr[i].equalsIgnoreCase("java")){
            countJva++;
        }if (wordArr[i].equalsIgnoreCase("python")){
            countPyt++;
        }
    }
        System.out.println(countJva);
        System.out.println(countPyt);

    }




}
