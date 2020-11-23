package PhoneStore.dataBase.services.impl;

import PhoneStore.dataBase.models.Product;
import java.util.List;

public interface ProductService {
    Product findByModel(String model);
    void save(Product product);
    void update(Product product);
    void delete(Product product);
    List<Product> findAllProducts();
    void deleteAllProducts();
}
