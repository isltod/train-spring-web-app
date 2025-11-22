package context;

import com.mycompany.ordersystem.CustomerRepository;
import com.mycompany.ordersystem.CustomerRepositoryImpl;
import com.mycompany.ordersystem.CustomerService;
import com.mycompany.ordersystem.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CustomerRepository customerRepository() {
        return new CustomerRepositoryImpl();
    }

    @Bean
    public CustomerService customerService() {
        return new CustomerServiceImpl(customerRepository());
//        CustomerServiceImpl customerService = new CustomerServiceImpl();
//        customerService.setCustomerRepository(customerRepository());
//        return customerService;
    }
}
