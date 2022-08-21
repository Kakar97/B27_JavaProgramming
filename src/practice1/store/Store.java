package practice1.store;

public class Store {

    public String grocery;
    public String Beer;
    public String soda;
    public int lottery;

    public Store(String grocery,String Beer,String soda, int lottery){
        this.grocery = grocery;
        this.Beer= Beer;
        this.soda = soda;
        this.lottery = lottery;
    }


    public String toString() {
        return "Store{" +
                "grocery='" + grocery + '\'' +
                ", Beer='" + Beer + '\'' +
                ", soda='" + soda + '\'' +
                ", lottery=" + lottery +
                '}';
    }
}
