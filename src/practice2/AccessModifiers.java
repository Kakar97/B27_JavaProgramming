package practice2;

public class AccessModifiers {

    private static int n1 = 100;//private modifiers

    static int n2 = 200; //default modifiers

    public static int n3 = 100;

    private static void method1(){ // private modifier
        System.out.println("method with private access modifier");
    }

    static void method2(){// default modifier
        System.out.println("method with default access modifier");
    }

   public static void method3(){// public modifier
       System.out.println(" method with public access modifier");
    }





}
