package practice1;

public class ReturnMethod {


    public static void main(String[] args) {

        int str1 = sumOFTwoNumbers(20,15) ;
        int str2 = sumOFThreeNumbers(10,50,5);

        int st3 = sumOfTheFourNumbers(20,40,10,10);
        System.out.println("sum of the 2 numbers: " + str1 +"\n" +"sum of the three number: " + str2 +"\n" + "sum of the 4 numbers: " + st3 );
    }




public static int sumOFTwoNumbers(int number1, int number2){
    return number1+ number2;

}


    public static int sumOFThreeNumbers(int number1, int number2, int number3){

    return number1 + number2 + number3;
    }

    public static int sumOfTheFourNumbers(int number1,int number2, int number3, int number4){
    return number1 + number2 + number3 + number4;

    }

        }














