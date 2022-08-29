package day40_inheritance.finalexample;

public class UsingFinal extends Test{// extend FinalExample doesn't work because FinalExample class is final
    // cannot extend String
    // cannot extend Math
    public static void main(String[] args) {
        FinaleExample obj1 = new FinaleExample(20);
        System.out.println( obj1.a);
        System.out.println(obj1.b);
        // cannot change final variables

        //obj1.a = 4;
       // obj1.b =  40;

        System.out.println(FinaleExample.PLANET);
        //FinaleExample.PLANET = "Mars";

        Test obj2 = new Test();
        obj2.helloWorld();
    }
  //  @Override
   // public void helloWorld(){

  //  }     cannot override final methods
}

class Test{
    public final void helloWorld(){
        System.out.println("Hello World");

    }
}