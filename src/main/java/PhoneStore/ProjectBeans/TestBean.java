package PhoneStore.ProjectBeans;

import org.springframework.stereotype.Component;

@Component()
public class TestBean {
    private String name = "myName";

    public TestBean() {
    }

    public String getName() {
        return name;
    }
}
