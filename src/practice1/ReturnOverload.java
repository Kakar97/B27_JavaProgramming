package practice1;

public class ReturnOverload {

    public static void main(String[] args) {
        int str1 = sum(10,10);
        int str2 = sum(10,10,10);
        int str3 = sum(5,5,5);
        double str5 = sum(2.5,2.5);
        double str6 = sum(5.5,6.7,7.5);

        System.out.println("sum of number1: " + str1+"\n" + "sum of the number2: " + str2 + "\n" + "sum of the number three: " + str3 + "\n" + "sum of number5: " + str5 + "\n" + "sum of number6: " + str6);

    }



    public static int sum(int number1, int number2){
        return number1 + number2;
    }

    public static double sum(double number5, double number6){
        return number5 + number6;
    }

    public static double sum ( double number5, double number6 , double number7){
        return sum(number5,number6)+ number7;
    }

    public static int sum(int number1, int number2, int number3){
        return number1 +number2 +number3;
    }

    public static int sum(int number1,int number2,int number3, int number4){
        return sum (number1, number2,number3 )+ number4;
    }
}
