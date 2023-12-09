package org.sadik.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer sadik = new Customer("Sadik", "01926-965690");
        getCustomer(sadik);
        gettingConsumer.accept(sadik);
        greetCustomerConsumerV2.accept(sadik, true);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNo) ->
            System.out.println( "Hello " + customer.customerName + ", thanks for registering phone number " +
                    (showPhoneNo ? customer.customerPhoneNumber : "*********"));

    static Consumer<Customer> gettingConsumer =  consumer ->
            System.out.println("Hello " + consumer.customerName +
            ", thanks for registration your phone number is " +
                    consumer.customerPhoneNumber);
    static void getCustomer (Customer customer){
        System.out.println("Hello " + customer.customerName +
                ", thanks for registration your phone number is " +
                customer.customerPhoneNumber);


    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
