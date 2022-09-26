package day47_collections;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();
        // Keys are Integer
        // value are String
        // map1.add(); there is no add method
        map1.put(4,"four");
        map1.put(1,"one");
        map1.put(7,"seven");
        map1.put(10,"ten");
        map1.put(-2,"negative 2");
        map1.put(5,"five");
        map1.put(null,"empty");


        System.out.println(map1);


        Map<Integer,String> map2 = new LinkedHashMap<>();// m
        // Keys are Integer
        // value are String
        // map1.add(); there is no add method
        map2.put(4,"four");
        map2.put(1,"one");
        map2.put(7,"seven");
        map2.put(10,"ten");
        map2.put(-2,"negative 2");
        map2.put(5,"five");
        map2.put(null,"empty");

        System.out.println(map2);


        Map<Integer,String> map3 = new TreeMap<>();// MAINTAINS NATURAL ORDER FOR THE KEYS
        // Keys are Integer
        // value are String
        // map1.add(); there is no add method
        map3.put(4,"four");
        map3.put(1,"one");
        map3.put(7,"seven");
        map3.put(10,"ten");
        map3.put(-2,"negative 2");
        map3.put(5,"five");
        //map3.put(null,"empty"); not allow

        System.out.println(map3);

        Map<Integer,String> map4 = new Hashtable<>();// RANDOM ORDER
        // Keys are Integer
        // value are String
        // map1.add(); there is no add method
        map4.put(4,"four");
        map4.put(1,"one");
        map4.put(7,"seven");
        map4.put(10,"ten");
        map4.put(-2,"negative 2");
        map4.put(5,"five");
        //map4.put(null,"empty");  NULL KEY not allow

        System.out.println(map4);
    }
}
