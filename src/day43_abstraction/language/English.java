package day43_abstraction.language;

public class English implements Language {

    @Override
    public void hello() {
        System.out.println("Hello");

    }

    public void bye() {
        System.out.println("bye");

    }


}