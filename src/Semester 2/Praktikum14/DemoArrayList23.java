package Praktikum14;
import java.util.ArrayList;

public class DemoArrayList23 {
    public static void main(String[] args) {
        ArrayList<Customer23> customers = new ArrayList<>();

        Customer23 customer1 = new Customer23(1, "Zakia");
        Customer23 customer2 = new Customer23(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer23(4, "Cica"));

        customers.add(2,new Customer23(100, "Rosa"));

        System.out.print(customers.indexOf(customer2));

        Customer23 customer = customers.get(1);
        System.out.print(customer.name);
        customer.name = "Budi Utomo";
        
        ArrayList<Customer23> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer23(201, "Della"));
        newCustomers.add(new Customer23(202, "Victor"));
        newCustomers.add(new Customer23(203, "Sarah"));

        customers.addAll(newCustomers);
        
        for (Customer23 cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);
    }
}