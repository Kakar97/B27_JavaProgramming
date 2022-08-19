package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayCollectionPractice {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(200,100,90,80,70,60, 70,20,50,50,100,90, 10));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("------------------------");

        Collections.max(numbers);
        Integer max =  Collections.max(numbers);
        System.out.println("max = " + max);

        Collections.min(numbers);
        Integer min = Collections.min(numbers);
        System.out.println("min = " + min);

        Collections.reverse(numbers);
        System.out.println(numbers);

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

        Collections.swap(numbers, 1,2);
        System.out.println(numbers);

        numbers.addAll(Arrays.asList(15,15,15,15));
        System.out.println(numbers);

        int count = Collections.frequency(numbers,50);
        System.out.println(count);

        int sum = Collections.frequency(numbers,15);
        System.out.println("sum = " + sum);





    }
}
