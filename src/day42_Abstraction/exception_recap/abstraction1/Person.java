package day42_Abstraction.exception_recap.abstraction1;

public abstract class Person {


    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void sleep(int hours);

    @Override
    public String toString(){
        return name + " " + age;
    }
}
