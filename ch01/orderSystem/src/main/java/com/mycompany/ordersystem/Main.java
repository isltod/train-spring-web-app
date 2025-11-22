package com.mycompany.ordersystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = context.getBean("customerService", CustomerService.class);
        List<Customer> customers = customerService.getCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        Customer newCustomer = new Customer();
        newCustomer.setId(6);
        newCustomer.setName("김육");
        newCustomer.setAddress("제주시");
        newCustomer.setEmail("kim6@test.com");
        customerService.saveCustomer(newCustomer);
        Customer customer6 = customerService.getCustomer(6);
        System.out.println(customer6);

        System.out.println();
        customerService.deleteCustomer(1);
        // 참조 변수라 이건 사실 필요 없지만 리프레쉬한다는 시늉으로..
        customers = customerService.getCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
