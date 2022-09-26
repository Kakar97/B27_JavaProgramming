package day42_Abstraction.exception_recap.abstraction;

public class Gym {
    public static void main(String[] args) {

      //  Exercise obj = new Exercise() { } NOT VALID BECAUSE IS ABSTRACT CANNOT CREAT OBJECTS FROM IT

        Running run = new Running();
        run.perform();
        run.getCaloriesBurned(30);

        // Lifting obj = new Lifting(); Lifting is abstract  cannot

    }
}
