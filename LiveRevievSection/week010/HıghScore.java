package week010;

public class HıghScore {
    public static void main(String[] args) {

        hıghScorePositiıon("halil", "1");
        calculateHıghScorePosıtıon(500);


    }

    public static void hıghScorePositiıon(String name, String positiıon) {
        System.out.println(name + " manged get into posıtıon " + positiıon + " on the hıgh score table");
    }

    public static int calculateHıghScorePosıtıon(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
