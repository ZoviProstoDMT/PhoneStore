package dataBase.dao;

import dataBase.dao.impl.ProductDao;
import dataBase.models.Product;
import dataBase.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDaoImpl implements ProductDao {

    public Product findByModel(String model) {
        Session session =  HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Product product = session.byId(Product.class).load(model);
        session.close();
        return product;
    }

    public void save(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(product);
        tx1.commit();
        session.close();
    }

    public void update(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(product);
        tx1.commit();
        session.close();
    }

    public void delete(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(product);
        tx1.commit();
        session.close();
    }

    public List<Product> findAllProducts() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Product> products = (List<Product>) session.createQuery("FROM " + Product.class.getSimpleName()).list();
        session.close();
        return products;
    }

    public void deleteAllProducts() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.createQuery("DELETE FROM " + Product.class.getSimpleName()).executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}
