package working21;

public class _4 {
    public static void main(String[] args) {

        String[]words={"anna", "level", "Java"};

        int count=0;


        for (int i=0;i< words.length;i++){
            String result="";
            for (int j=words[i].length()-1;j>=0;j--){
               result+=words[i].charAt(j)+"";

                }
            if (words[i].equals(result)){
                count++;
            }

        }
        System.out.println(count);
    }



}
