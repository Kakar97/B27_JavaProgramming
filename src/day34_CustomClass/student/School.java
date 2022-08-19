package day34_CustomClass.student;

public class School {
    public static void main(String[] args) {




        Student studentOne = new Student();// created an object of Student
        System.out.println(studentOne); // print the objects, but we get some hash values
// instance variables being assigned a value
        studentOne.name = "Olena";
        studentOne.batchNumber = 27;
        studentOne.program = "SDET";
        studentOne.grade = 99.99;

        System.out.println(studentOne); // this still does not show us anything useful

        System.out.println(studentOne.name);
        System.out.println(studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);

        // call in the instance method:
        studentOne.study();

        System.out.println("----------------------------");

        Student studentTwo = new Student();// object
        System.out.println(studentTwo.name);
        System.out.println(studentTwo.batchNumber);
        System.out.println(studentTwo.program);
        System.out.println(studentTwo.grade);

        studentTwo.study();

        /*
        In this case we created a new object of the student class int mean this bject has a fresh copy of the instance variable whic mean variables, which mean they will have their default values
         */




    }
}