public class Main {
    public static void main(String[] args) {


        Employee bob = new Employee("Bob", "05/02/1986", 11123, "10/02/2023");
        System.out.println(bob);
        System.out.println("Age = " + bob.getAge());
        System.out.println("Pay = " + bob.collectPay());

    }
}