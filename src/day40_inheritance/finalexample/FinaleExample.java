package day40_inheritance.finalexample;

public final class FinaleExample {

    final public  int a = 10;// hard coded instance variable
    public final int b;
    public static final String PLANET = "Earth";
    public static final String Test_1 = "test.us.google.com";


    // public static final -> this keyword together is what makes a constant
    public FinaleExample(int num){
        b = num;// when the object is created, the given argument will be the value of b, then it cannot be changed

    }


}
