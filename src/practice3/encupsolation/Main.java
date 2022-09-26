package practice3.encupsolation;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
            customer.setName("J...");
            customer.setEmail("jawee@gmail.com");
            String email = customer.getEmail();

            String name = customer.getName();
        System.out.println(name);
        System.out.println(email);

    }
}
