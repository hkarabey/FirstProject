package working20;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Q4 {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i=0;i<=names.length;i++){
            int score=scores[i];
            if (score>=90){
                grades[i]='A';
            }
            else if (score>=80&&score<90){
                grades[i]='B';
            }
            else if (score>=70&&score<80){
                grades[i]='C';
            }
            else if (score>=60&&score<70){
                grades[i]='D';
            }else{
                grades[i]='F';
            }

            System.out.println(names[i]+" score is "+scores[i]+" grades is "+grades[i]);

        }

    }


}
