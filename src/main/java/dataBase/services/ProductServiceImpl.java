package dataBase.services;

import dataBase.dao.ProductDaoImpl;
import dataBase.models.Product;
import dataBase.services.impl.ProductService;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private final ProductDaoImpl productDao = new ProductDaoImpl();

    public ProductServiceImpl() {
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
