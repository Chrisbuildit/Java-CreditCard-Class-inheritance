public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("John", "Matfield",12, new VisaCard(5000) );
        Customer customer2 = new Customer("Frodo", "Balings", new MasterCard(0));

        customer2.printName();
        customer2.getCreditCard().pay(50);
        System.out.println(customer2.getCreditCard().getDebt());
        customer.getCreditCard().pay(10);
        System.out.println(customer.getCreditCard().getDebt());
    }
}
