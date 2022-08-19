package day34_CustomClass.house;

public class House {


    String type;
    double squareFeet;
    int numberOfBedroos;
    int getNumberOfBathrooms;
    boolean inCity;
    boolean hasGarage;

    public double calculateMortgage(){
        if(numberOfBedroos < 2){
            return  1500;
        }else if (numberOfBedroos < 4){
            return 2000;
        }else {
            return 2500;
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedroos=" + numberOfBedroos +
                ", getNumberOfBathrooms=" + getNumberOfBathrooms +
                ", inCity=" + inCity +
                ", hasGarage=" + hasGarage +
                '}';





    }
}

