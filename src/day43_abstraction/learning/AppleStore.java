package day43_abstraction.learning;

public class AppleStore {
    public static void main(String[] args) {

        // everything i can access without any class, directly from the interface

        System.out.println(Mac.brand);
        System.out.println(Mac.os);
        Mac.getBrand();
        // use a class that implement the interface

        Desktop obj = new Desktop();
        obj.turnOn();
        obj.typing();

       // obj.getBrand(); cannot access the static memebers from the classes that implement that interface.
        // only access static members of an interface by the interface
    }
}
