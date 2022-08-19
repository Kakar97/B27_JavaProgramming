package Day31_ArrayList;

import java.util.ArrayList;

public class RemovingMethod {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flaying");
        System.out.println(words);
        words.remove(2);// return the element that you remove
        System.out.println(words);

        System.out.println(words.remove(0));
        System.out.println(words);

        System.out.println("------------------------------------------");
        words.clear();// empty the wole ArrayList
        System.out.println(words);

        words.add("jumping");
        words.add("bran");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);
        words.remove("bran");
        System.out.println(words);
        System.out.println(words.remove("Cow"));
        System.out.println(words);
        System.out.println(words.remove("Chicken"));
        System.out.println(words);

        System.out.println("-----------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);
        nums.remove(0);// 0 is int so it removes by index
        System.out.println(nums);
        Integer a = 0;
        nums.remove(a);// remove index or element?
        System.out.println(nums);

        nums.remove((Integer)2);// CASTING THAT 2 TO A Integer typ
        System.out.println(nums);
        nums.add(0,4);
        System.out.println(nums);
        nums.remove((Integer) 4);
        System.out.println(nums);
    }
}
/*
String s = "hello"
 */
