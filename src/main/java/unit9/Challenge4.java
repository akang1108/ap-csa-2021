package unit9;


public class Challenge4 {
    // can only have one public class in a file public class Main {
    public static void main(String[] args) {
        // create object and print contents
        Customer customer1 = new Customer("Fran Santiago", "123 Main St., Anytown, USA");
        System.out.println(customer1);

        // uncomment these to test OnlineCustomer
        OnlineCustomer customer2 = new OnlineCustomer("Jasper Smith", "456 High St., Anytown, USA", "jsmith456@gmail.com");
        System.out.println(customer2);
    } // main()

    static class Customer {
        // instance variables
        private String name;
        private String address;

        // constructor takes 2 arguments
        public Customer(String name, String address) {
            this.name = name;
            this.address = address;
        }

        // toString method
        public String toString() {
            return "Name: " + name + "\nAddress: " + address;
        }
    } // Customer

    // change code so OnlineCustomer class to inherit from Customer
    // Add a new instance variable for the email address of an online customer
    // Add a constructor with 3 arguments (name, address, email) that uses the super constructor
    // Override the toString() method to call the super class toString() method and then add on the email address.
    // Prints "\nEmail:" and the email variable.
    static class OnlineCustomer extends Customer {
        private String email;

        public OnlineCustomer(String name, String address, String email) {
            super(name, address);
            this.email = email;
        }

        @Override
        public String toString() {
            return super.toString() + "\nEmail: " + email;
        }
    } // OnlineCustomer
}
