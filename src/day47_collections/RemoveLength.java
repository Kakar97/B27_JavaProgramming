package day47_collections;

import java.util.*;

public class RemoveLength {
    public static void main(String[] args) {

        Set<String>words = new HashSet<>(Arrays.asList("one", "two", "JAVA", "hello", "world","automation","soft skills","lunch"));

        Iterator<String>it = words.iterator();
        while (it.hasNext()){
            if(it.next().length()<=6){
                it.remove();
            }
        }
        System.out.println(words);
    }
}
