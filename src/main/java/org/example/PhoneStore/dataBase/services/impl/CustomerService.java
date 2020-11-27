package org.example.PhoneStore.dataBase.services.impl;


import org.example.PhoneStore.dataBase.models.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomer(int id);
    void saveCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    void updateCustomer(Customer customer);
    List<Customer> findAllCustomers();
    void deleteAllCustomers();
}
