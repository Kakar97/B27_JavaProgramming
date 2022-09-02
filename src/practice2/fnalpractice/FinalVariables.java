package practice2.fnalpractice;

public class FinalVariables {





    public final String Language;
    public final static double PI;

    public FinalVariables(String language){
        this.Language = language;
    }

    static {
        PI = 3.14;

    }

    public static void main(String[] args) {
        final int number = 10;
        //number=20
        System.out.println(number);
    }


    }









