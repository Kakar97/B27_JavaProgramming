package day42_Abstraction.exception_recap.abstraction;

public class Running extends Exercise{

    @Override
    public void perform(){
        System.out.println("we are running");
    }
    @Override
    public void getCaloriesBurned(int minutes){
        System.out.println(minutes*0.35);
    }
}
/*
Running is an exercise
Running is non - abstract (normal class)
Running is the first non-abstract class it is the concrete class

concrete classes must implement (override) all the abstract methods
 */