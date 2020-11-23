package PhoneStore.ProjectBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBean {

    @Autowired
    public OtherBean(TestBean testBean) {
        System.out.println("Создался объект OtherBean. Имя тестбина: " + testBean.getName());
    }
}
