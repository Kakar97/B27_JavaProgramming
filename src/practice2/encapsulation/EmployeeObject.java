package practice2.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        //employee1.name = "Jash";
        //employee1.salary = 120000;

        employee1.setName("Jash");
        employee1.setSalary(120000);
        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());


    }
}
