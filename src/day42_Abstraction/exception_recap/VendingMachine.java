package day42_Abstraction.exception_recap;

public class VendingMachine {
    /*
        Chips   Gum   Candy
         1        2      3

     */

    public static String select(int selection) {

        String item = "";

        if (selection == 1) {
            item = "Chips";
        } else if (selection == 2) {
//            item = "Gum"; --> out of stock
            throw new OutOfStockException();//CAUSES THE EXCEPTION TO HAPPEN
        } else if (selection == 3) {
            item = "Candy";
        }

        return item;
    }
    public static String selectValid(int selection) throws InvalidSelectionException {

        String item = "";

        if (selection == 1) {
            item = "Chips";
        } else if (selection == 2) {
//            item = "Gum"; --> out of stock

        } else if (selection == 3) {
            item = "Candy";
        } else{

            throw new InvalidSelectionException();// checked exception mus be handled but also i created this so i dont want to handle myself
    }

        return item;

}}