package com.mycompany.ordersystem;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
    private List<Customer> customers;

    public CustomerRepositoryImpl() {
        customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("김일");
        customer.setAddress("서울시");
        customer.setEmail("kim1@test.com");
        customers.add(customer);
        Customer customer1 = new Customer();
        customer1.setId(2);
        customer1.setName("김이");
        customer1.setAddress("부산시");
        customer1.setEmail("kim2@test.com");
        customers.add(customer1);
        Customer customer2 = new Customer();
        customer2.setId(3);
        customer2.setName("김삼");
        customer2.setAddress("인천시");
        customer2.setEmail("kim3@test.com");
        customers.add(customer2);
        Customer customer3 = new Customer();
        customer3.setId(4);
        customer3.setName("김사");
        customer3.setAddress("대전시");
        customer3.setEmail("kim4@test.com");
        customers.add(customer3);
        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setName("김오");
        customer4.setAddress("광주시");
        customer4.setEmail("kim5@test.com");
        customers.add(customer4);
    }

    @Override
    public Customer findById(long id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) return customer;
        }
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public List<Customer> findByName(String name) {
        return customers.stream()
                .filter(customer -> name.equals(customer.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public void save(Customer customer) {
        Customer foundCustomer = findById(customer.getId());
        if (foundCustomer != null) {
            customers.set(customers.indexOf(foundCustomer), customer);
            return;
        }
        customers.add(customer);
    }

    @Override
    public void delete(long id) {
        Customer customer = findById(id);
        if (customer != null) customers.remove(customer);
    }
}
