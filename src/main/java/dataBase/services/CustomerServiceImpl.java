package dataBase.services;

import dataBase.dao.CustomerDaoImpl;
import dataBase.models.Customer;
import dataBase.services.impl.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerDaoImpl customerDao = new CustomerDaoImpl();
    
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
