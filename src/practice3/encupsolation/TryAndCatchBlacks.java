package practice3.encupsolation;

public class TryAndCatchBlacks {

    public static void main(String[] args) {


        try {
            System.out.println(9 / 0);
            System.out.println("try black");
            System.out.println("need assistance ");


       } catch (RuntimeException e) {
//e.printStackTrace();

            System.out.println(e.getMessage());
            System.out.println("Runtime black");
            System.out.println("need more people");
            System.exit(2);

        }

        finally {
            System.out.println("some one goto school");
        }

        System.out.println("Hello World");

    }
}