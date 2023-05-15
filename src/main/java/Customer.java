public class Customer {
    String name;
    String lastName;
    int customerNumber;
    CreditCard creditCard;

    //A constructor
    //? Waarom 4 argumente as maar 3 parameters? Waarom gebruik 'this' sonder 'n punt?
    public Customer(String name, String lastName, CreditCard creditCard) {
        this(name, lastName, (int)(Math.random() * 100), creditCard);
    }

    //A constructor
    public Customer(String name, String lastName, int customerNumber, CreditCard creditCard) {
        this.name = name;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.creditCard = creditCard;
    }

    public void printName() {
        System.out.println("Customer " + name);
    }

    //? Waarom word metode hier gedeclareerd en niet in Creditcard zelf?
    public CreditCard getCreditCard() {
        return creditCard;
    }
}


