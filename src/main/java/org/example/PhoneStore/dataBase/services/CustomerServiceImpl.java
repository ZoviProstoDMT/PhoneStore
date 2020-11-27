package org.example.PhoneStore.dataBase.services;

import org.example.PhoneStore.dataBase.dao.CustomerDaoImpl;
import org.example.PhoneStore.dataBase.models.Customer;
import org.example.PhoneStore.dataBase.services.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDaoImpl customerDao;
    
    public CustomerServiceImpl() {
    }

    @Override
    public Customer findCustomer(int id) {
        return customerDao.findById(id);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerDao.delete(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.update(customer);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerDao.findAll();
    }

    @Override
    public void deleteAllCustomers() {
        customerDao.deleteAll();
    }
}
