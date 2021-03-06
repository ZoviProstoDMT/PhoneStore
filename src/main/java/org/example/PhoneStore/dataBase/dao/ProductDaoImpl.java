package org.example.PhoneStore.dataBase.dao;

import org.example.PhoneStore.dataBase.dao.impl.ProductDao;
import org.example.PhoneStore.dataBase.models.Product;
import org.example.PhoneStore.dataBase.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDaoImpl implements ProductDao {

    public Product findById(int id) {
        Session session =  HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Product product = session.byId(Product.class).load(id);
        session.close();
        return product;
    }

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
