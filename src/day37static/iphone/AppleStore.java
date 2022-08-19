package day37static.iphone;

import day37static.iphone.IPhone;

public class AppleStore {

    public static void main(String[] args) {
        IPhone iPhone1 = new IPhone("Iphon x", "Balack", 1000,256);
        System.out.println(iPhone1);
        System.out.println(IPhone.brand);
        System.out.println(iPhone1.os);
        // we could use the object to access to static variables, but better to use the class name

        IPhone iPhone2 = new IPhone("Iphon 7 x", "Silver", 1000,256);
        System.out.println(iPhone2);
    }
}
