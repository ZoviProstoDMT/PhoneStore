package PhoneStore.dataBase.dao;

import PhoneStore.dataBase.dao.impl.UserDao;
import PhoneStore.dataBase.models.User;
import PhoneStore.dataBase.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("test");
        user.setPassword("test");
        user.setFirstname("test");
        user.setLastname("test");
        new UserDaoImpl().save(user);
    }
    @Override
    public User findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }

    @Override
    public User findByUsername(String username) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return (User) session.createQuery("from User where username=:username")
                .setParameter("username", username).uniqueResult();
    }

    @Override
    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    @Override
    public List<User> findAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<User> users = (List<User>) session.createQuery("From " + User.class.getSimpleName()).list();
        session.close();
        return users;
    }

    @Override
    public void deleteAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.createQuery("DELETE FROM " + User.class.getSimpleName()).executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public boolean isExist(User user) {
        return findByUsername(user.getUsername()) != null;
    }
}
