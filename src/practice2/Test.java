package practice2;

public class Test {
    public static void main(String[] args) {

       // System.out.println(AccessModifiers.n1); privet is not visible
        System.out.println(AccessModifiers.n2);
        System.out.println(AccessModifiers.n3);


        //AccessModifiers.method1();// privet method is not visible
        AccessModifiers.method2();//default method is visible
        AccessModifiers.method3();// public method is visible


    }
}
