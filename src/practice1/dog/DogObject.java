package practice1.dog;

import practice1.dog.Dog;

public class DogObject {
    public static void main(String[] args) {

       Dog dog1  = new Dog();
       dog1.name = "Lucy";
       dog1.breed = "Husky";
       dog1.size = "Large";
       dog1.age = 5;
       dog1.color = "White";
       dog1.gender = 'F';

        Dog dog2  = new Dog();
        dog2.name = "Jive";
        dog2.breed = "German";
        dog2.size = "Small";
        dog2.age = 2;
        dog2.color = "Green";
        dog2.gender = 'm';

        System.out.println(dog1);
        System.out.println(dog2);

        dog1.eat();
        dog2.playing();








    }
}
