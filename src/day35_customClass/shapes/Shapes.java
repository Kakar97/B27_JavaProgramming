package day35_customClass.shapes;

import day35_customClass.shapes.Rectangle;

public class Shapes {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.base = 4.5;
        rectangle1.height = 8.2;
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle1);

    }
}