package PhoneStore.dataBase.dao.impl;

import PhoneStore.dataBase.models.Customer;
import java.util.List;

public interface CustomerDao {
    Customer findById(int id);
    Customer findByFirstname(String firstname);
    Customer findByLastname(String lastname);
    void save(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
    List<Customer> findAll();
    void deleteAll();
}
