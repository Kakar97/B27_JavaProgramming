package practice2;

public class Address {

    private String name;
    private String address;
    private  double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <= 0){
            System.out.println("salary is invalid: " + salary);
            System.exit(0);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
