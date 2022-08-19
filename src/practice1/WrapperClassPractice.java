package practice1;

public class WrapperClassPractice {
    public static void main(String[] args) {

        int a =  10;
        byte b = 20;
        double c = 10.20;

        Integer x = a;
        Byte M = b;
        Double F = c;

        int G = x;
        byte k = M;
        double s = F;

        String str1 = "150"; // parse method convert to string to integer data type
        int number1 = Integer.parseInt(str1);
        System.out.println(str1);

        String str2 = "2.5";

        Double z = Double.valueOf(str2);
        System.out.println(z);

       String str4 = "5.5";
        double y = Double.parseDouble(str4);
        System.out.println(y);

      Double number2  = 10.5;
      double N1 = number2;
        System.out.println(N1);


    }
}
