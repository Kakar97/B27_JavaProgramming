package practice3;

public class Animal {

    public String name;
    public String breed;
    public String Size;

    public Animal(String name, String breed, String size) {
        this.name = name;
        this.breed = breed;
        Size = size;
    }
    public void eat(){
        System.out.println("name" + "is eating");
    }
}
