package practice1;

import practice2.AccessModifiers;

import java.lang.reflect.Modifier;

public class Test1 {

    public static void main(String[] args) { // in different package only public is visible,
       // System.out.println(AccessModifiers.n1);//in different package privet is not visible
        //System.out.println(AccessModifiers.n2);// in different package default is not visible
        System.out.println(AccessModifiers.n3);// public is visible in different package


        //AccessModifiers.method1(); privet method is not visible in different package
        //AccessModifiers.method2(); default method is not visible in different package
        AccessModifiers.method3();// only public method visible in every package/ every where

    }
}
