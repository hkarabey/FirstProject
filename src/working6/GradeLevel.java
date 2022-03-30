package working6;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel=13;
        if(gradeLevel>=1&&gradeLevel<=5){
            System.out.println("elementry scholl");
        }else if (gradeLevel>=6&&gradeLevel<=8){
            System.out.println("middle school");
        }else if (gradeLevel>=9&&gradeLevel<=12){
            System.out.println("high school");
        }else if (gradeLevel>=13&&gradeLevel<=16){
            System.out.println("college");
        }else if (gradeLevel>=17&&gradeLevel<=18){
            System.out.println("grad school");
        }

    }



}
