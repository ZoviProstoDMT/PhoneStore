package PhoneStore.dataBase.services;

import PhoneStore.dataBase.dao.ProductDaoImpl;
import PhoneStore.dataBase.models.Product;
import PhoneStore.dataBase.services.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    private final ProductDaoImpl productDao;

    public ProductServiceImpl(ProductDaoImpl productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product findById(int id) {
        return productDao.findById(id);
    }

    @Override
    public Product findByModel(String model) {
        return productDao.findByModel(model);
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public void update(Product product) {
        productDao.update(product);
    }

    @Override
    public void delete(Product product) {
        productDao.delete(product);
    }

    @Override
    public List<Product> findAllProducts() {
        return productDao.findAllProducts();
    }

    @Override
    public void deleteAllProducts() {
        productDao.deleteAllProducts();
    }
}
