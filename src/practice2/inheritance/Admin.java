package practice2.inheritance;

public class Admin {




    public String nameOfDirector;
    public String name;
    public int numOfDirectors;
    public int numOfEmployees;
    public double salary;
    public String address;
    public int numberOfFemale;

    public void work(){
        System.out.println(nameOfDirector + "are working");
    }

    @Override
    public String toString() {
        return "Ministry{" +
                "nameOfDirector='" + nameOfDirector + '\'' +
                ", name='" + name + '\'' +
                ", numOfDirectors=" + numOfDirectors +
                ", numOfEmployees=" + numOfEmployees +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", numberOfFemale=" + numberOfFemale +
                '}';
    }
}
