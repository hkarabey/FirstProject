package working6;

public class AgeGroup {
    public static void main(String[] args) {
        int age=12;
        if(age>=1&&age<=2){
            System.out.println("infant");
        }else if (age>=3&&age<=5){
            System.out.println("Toddler");
        }
        else if (age>=6&&age<=9){
            System.out.println("kid");
        }else if (age>=10&&age<=12){
            System.out.println("pre-teen");
        }else if (age>=13&&age<=17){
            System.out.println("teenager");
        }else if (age>=18&&age<=20){
            System.out.println("young adult");
        }else if (age>=21&&age<=39){
            System.out.println("adult");
        }else if (age>=40&&age<=49){
            System.out.println("young middle age adult");
        }else if (age>=50&&age<=54){
            System.out.println("middle age adult");
        }else if (age>=55&&age<=64){
            System.out.println("very young senior citizen");
        }else if (age>=65&&age<=74){
            System.out.println("young senior citizen");
        }else if (age>=75&&age<=84){
            System.out.println("senior citizen");
        }else if (age>=85){
            System.out.println("old senior citizen");
        }else{
            System.out.println("write a correct age");
        }




    }


}
