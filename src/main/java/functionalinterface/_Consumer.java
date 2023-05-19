package functionalinterface;

import java.util.BitSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //Normal Java Function
       Customer Abhi=  new Customer("Abhi","12345");
       greetCustomer(Abhi);
       greeetCustomerV2(Abhi, false);

        //Functional interface
        greetCustomerConsumer.accept(Abhi);
        greetCustomerConsumerV2.accept(Abhi,false);
    }
    static void greetCustomer(Customer customer){
        System.out.println("Hello " +
                customer.customerName+
                 " Thanks for registering with phone number " +
                customer.CustomerPhoneNumber);
    }
    static void greeetCustomerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " +
                customer.customerName+
                " Thanks for registering with phone number " +
                (showPhoneNumber ? customer.CustomerPhoneNumber : "********"));

    }

    static Consumer<Customer>greetCustomerConsumer = customer -> System.out.println("Hello " +
            customer.customerName +
            " Thanks for registering with the phone number "+
            customer.CustomerPhoneNumber);
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " +
                    customer.customerName +
                    " Thanks for registering with the phone number "+ (showPhoneNumber ? customer.CustomerPhoneNumber : "********"));
    static class Customer{

        private final String customerName;
        private final String CustomerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            CustomerPhoneNumber = customerPhoneNumber;

        }


    }
}
