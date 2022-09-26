package day47_collections;

import my_utils.StringUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, Double>Store = new HashMap<>(
                Map.of("Water", 2.99,"Bread", 4.99, "Milk", 3.99, "fruit", 3.39));

        System.out.println(Store);
        System.out.println("water item are would you like");

        String item = StringUtil.fixFormat(input.next());

        if(Store.containsKey(item)){
            System.out.println(item + "is in stock");
            System.out.println("price is $" + Store.get(item));
        }else {
            System.out.println(item + " is not in stock");
        }




    }
}
