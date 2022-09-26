package day47_collections;

import java.util.HashMap;
import java.util.Map;

public class GroupOfPeople {
    public static void main(String[] args) {

        Map<Integer, Person> residents = new HashMap<>();
        // idea: apartment (key) - person - value
        residents.put(201,new Person("james", 40));
        residents.put(202,new Person("Anna", 20));
        residents.put(203,new Person("Faith", 30));
        residents.put(204,new Person("james", 40));
        System.out.println(residents);
        System.out.println(residents.get(202));// returns the value of key 202-> value is a person object
        System.out.println(residents.get(202).name); // accessing the name variable from the person object
        System.out.println(residents.get(202).name.substring(0,2));
    }
}
