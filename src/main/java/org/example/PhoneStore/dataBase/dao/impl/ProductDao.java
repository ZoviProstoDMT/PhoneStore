package org.example.PhoneStore.dataBase.dao.impl;



import org.example.PhoneStore.dataBase.models.Product;

import java.util.List;

public interface ProductDao {
    Product findById(int id);
    Product findByModel(String model);
    void save(Product product);
    void update(Product product);
    void delete(Product product);
    List<Product> findAllProducts();
    void deleteAllProducts();
}
