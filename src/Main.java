public class Main {
    public static void main(String[] args) {


        Employee bob = new Employee("Bob", "05/02/1986", "10/02/2023");
        System.out.println(bob);
        System.out.println("Age = " + bob.getAge());
        System.out.println("Pay = " + bob.collectPay());

        System.out.println();

        Employee jimmy = new Employee("Jimmy", "04/15/1985", "08/11/2023");
        System.out.println(jimmy);
        System.out.println("Age = " + jimmy.getAge());
        System.out.println("Pay = " + jimmy.collectPay());

        System.out.println();

        SalariedEmployee megan = new SalariedEmployee("Megan", "07/24/1985", "01/22/2021", 55000);
        System.out.println(megan);
        System.out.println("Megan's paycheck = $" + megan.collectPay());
        megan.retire();
        System.out.println("Megan's pension check = $" + megan.collectPay());

        System.out.println();

        HourlyEmployee kayla = new HourlyEmployee("Kayla", "08/03/1985", "03/17/2021", 24);
        System.out.println(kayla);
        System.out.println("Kayla's biweekly pay is $" + kayla.collectPay());

    }
}