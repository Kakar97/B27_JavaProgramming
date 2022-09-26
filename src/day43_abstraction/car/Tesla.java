package day43_abstraction.car;

public class Tesla extends  ElectricCar{
    @Override
    public void start() {
        System.out.println("key car near by, starting car");

    }

    @Override
    public void charge() {
        System.out.println("tesla charging ");

    }
}
// Tesla is a ElectricCar
// Tesla is a Car
// Tesla is an Object