package interfaceInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext(new String[] {"Interface.xml"});

//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Interface.xml"));
        Foo obj = (Foo) factory.getBean("foo");
         System.out.println("dfd");
     }
}
