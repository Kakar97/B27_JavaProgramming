package day35_customClass.carpet;

public class Store {
    public static void main(String[] args) {

        Carpet kover = new Carpet(12.5, 35,12.99, false);
        System.out.println(kover);


        Carpet persion = new Carpet(12.5, 35,12.99, true);
        System.out.println(persion);

        persion.width = 16.5;
        persion.calculatePrice();;
        System.out.println(persion);



    }
}
