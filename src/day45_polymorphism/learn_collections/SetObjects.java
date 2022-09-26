package day45_polymorphism.learn_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {


        Set<String> set1 = new HashSet<>();
        set1.add(null);
        set1.add("hello world");
        set1.add("5.0");
        set1.add("#zebra");
        set1.add("hello world");
        set1.add("Java");
        System.out.println(set1);


        Set<String> set2 = new LinkedHashSet<>();// maintain insertion order
        set2.add(null);
        set2.add("hello world");
        set2.add("5.0");
        set2.add("#zebra");
        set2.add("hello world");
        set2.add("Java");
        System.out.println(set2);


        Set<String> set3 = new TreeSet<>();// maintains natural order(sorted)
        //set3.add(null); NULL IS NOT ALLOWED IN TreeSet
        set3.add("hello world");
        set3.add("5.0");
        set3.add("#zebra");
        set3.add("hello world");
        set3.add("Java");
        System.out.println(set3);

        // set3.get(0); no indexes in set type so no get methods
    }
}
