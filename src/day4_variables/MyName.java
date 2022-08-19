package day4_variables;

public class MyName {
    public static void main(String[] args) {
         /*
        declare your name as multiple char variables
        print your name, see what happens
     */


            char first = 'S';
            char second = 'a';
            char third = 'i';
            char fourth = 'm';

            System.out.print(first);
            System.out.print(second);
            System.out.print(third);
            System.out.print(fourth);
            System.out.println();

            System.out.println("my name is " + first + second + third + fourth); // concatenate a String in the beginning, this will concatenate all the chars together
        }
    }
