package dataBase.dao;

import dataBase.dao.impl.CustomerDao;
import dataBase.models.Customer;
import dataBase.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public Customer findByFirstname(String firstname) {
        return null;
    }

    @Override
    public Customer findByLastname(String lastname) {
        return null;
    }

    @Override
    public Customer findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Customer customer = session.get(Customer.class, id);
        session.close();
        return customer;
    }

    @Override
    public void save(Customer customer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(customer);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(Customer customer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(customer);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Customer customer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(customer);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Customer> findAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Customer> customers = (List<Customer>) session.createQuery("From " + Customer.class.getSimpleName()).list();
        session.close();
        return customers;
    }

    @Override
    public void deleteAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.createQuery("DELETE FROM " + Customer.class.getSimpleName()).executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}
