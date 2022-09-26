package day43_abstraction.language;

public class Speaking {
    public static void main(String[] args) {



       // Language obj = new Language() CAN NOT CREAT

        English object = new English();
        object.hello();
        object.bye();

        Spanish obj2 = new Spanish();
        obj2.hello();
        obj2.bye();


    }
}
