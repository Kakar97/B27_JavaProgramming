package practice1.dog;

public class Dog {

    public String name;
    public  String breed;
    public String size;
    public int age;
    public String color;
    public char gender;

    public void eat(){
        System.out.println(name+" is eating ");
    }

    public void drink(){
        System.out.println(name + " is drinking ");
    }

    public void playing (){
        System.out.println(name + " is playing ");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
}
