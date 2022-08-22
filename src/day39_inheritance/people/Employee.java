package day39_inheritance.people;

public class Employee extends person{

    double salary;

    public  Employee(String name, int age, double salary){
        super(name,age);
        this.salary = salary;


    }

    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
super()// calls parent constructor with no args
 */