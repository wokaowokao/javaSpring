package aa;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("Application.xml");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("App.xml");
        ConfigurableListableBeanFactory beanFactory = classPathXmlApplicationContext.getBeanFactory();
        TestBean p = (TestBean) ctx.getBean("testBean");
        System.out.println(p.getName());
    }

}
