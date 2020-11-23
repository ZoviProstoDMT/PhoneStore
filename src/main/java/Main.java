import PhoneStore.ProjectBeans.OtherBean;
import PhoneStore.ProjectBeans.TestBean;
import PhoneStore.dataBase.services.ProductServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OtherBean testBean = context.getBean("otherBean", OtherBean.class);
    }
}