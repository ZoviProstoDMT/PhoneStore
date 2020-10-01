package dataBase.services.impl;

import dataBase.models.Customer;
import dataBase.models.User;

import java.util.List;

public interface CustomerService {
    Customer findCustomer(int id);
    void saveCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    void updateCustomer(Customer customer);
    List<Customer> findAllCustomers();
    void deleteAllCustomers();
}
