package day42_Abstraction.exception_recap;

public class InvalidSelectionException extends Exception {//being a subclass of Exception class makes this a checked exception

    public InvalidSelectionException(){

            super("Selection can only be 1, 2, or 3");
    }

}
