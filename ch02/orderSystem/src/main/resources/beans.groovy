beans {
    customerRepository(com.mycompany.ordersystem.CustomerRepositoryImpl) {}
    customerService(com.mycompany.ordersystem.CustomerServiceImpl) {
        customerRepository = customerRepository
    }
}