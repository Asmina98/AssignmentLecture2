

public class Main {
    public static void main(String[] args) {
        Address chicagoAddress = new Address("123 Main St", "Chicago", "IL", "60601");
        Address newYorkAddress = new Address("456 Elm St", "New York", "NY", "10001");
        Address losAngelesAddress = new Address("789 Oak St", "Los Angeles", "CA", "90001");

        Customer customer1 = new Customer("John", "Doe", "123-45-6789");
        Customer customer2 = new Customer("Jane", "Smith", "987-65-4321");
        Customer customer3 = new Customer("Bob", "Johnson", "456-78-9012");

        customer1.setBillingAddress(chicagoAddress);
        customer1.setShippingAddress(newYorkAddress);

        customer2.setBillingAddress(newYorkAddress);
        customer2.setShippingAddress(losAngelesAddress);

        customer3.setBillingAddress(losAngelesAddress);
        customer3.setShippingAddress(chicagoAddress);

        Customer[] customers = {customer1, customer2, customer3};

        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}


