package day34_CustomClass.house;

import day34_CustomClass.house.House;

public class Market {
    public static void main(String[] args) {




      House house1 = new House();
        System.out.println(house1);

house1.type = "Townhouse";
house1.squareFeet = 1300;
house1.getNumberOfBathrooms = 2;
house1. numberOfBedroos = 3;
house1.inCity = false;
house1.hasGarage = true;

        System.out.println(house1);// don't need to call toString, because it is automaticaly called
        System.out.println(house1.calculateMortgage());







    }
}