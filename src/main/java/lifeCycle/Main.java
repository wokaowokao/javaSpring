package lifeCycle;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by 张亚威 on 2019-06-14 下午 1:51.
 */
public class Main {
    public static void main(String[] args) {


        //Bean实例生命周期的执行过程如下：
        //
        //Spring对bean进行实例化，默认bean是单例；
            //执行构造方法

        //Spring对bean进行依赖注入；
        //
        //如果bean实现了BeanNameAware接口，spring将bean的id传给setBeanName()方法；
        //
        //如果bean实现了BeanFactoryAware接口，spring将调用setBeanFactory方法，将BeanFactory实例传进来；
        //
        //如果bean实现了ApplicationContextAware接口，它的setApplicationContext()方法将被调用，将应用上下文的引用传入到bean中；
        //
        //如果bean实现了BeanPostProcessor接口，它的postProcessBeforeInitialization方法将被调用；
        //
        //如果bean实现了InitializingBean接口，spring将调用它的afterPropertiesSet接口方法，类似的如果bean使用了init-method属性声明了初始化方法，该方法也会被调用；
        //
        //如果bean实现了BeanPostProcessor接口，它的postProcessAfterInitialization接口方法将被调用；
        //
        //此时bean已经准备就绪，可以被应用程序使用了，他们将一直驻留在应用上下文中，直到该应用上下文被销毁；
        //
        //若bean实现了DisposableBean接口，spring将调用它的distroy()接口方法。
        // 同样的，如果bean使用了destroy-method属性声明了销毁方法，则该方法被调用；




        //MyInsBeanPostProcessor->postProcessBeforeInstantiation
        //car 构造
        //MyInsBeanPostProcessor->postProcessAfterInstantiation
        //MyInsBeanPostProcessor->postProcessPropertyValues

        //BeanNameAware->setBeanName
        //BeanFactoryAware->setBeanFactory

        //MyBeanPostProcessor->postProcessBeforeInitialization
        //InitializingBean->afterPropertiesSet
        //initCar
        //MyBeanPostProcessor->postProcessAfterInitialization

        //setBrand
        //DisposableBean->destroy
        //destroyCar
        ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:Beans.xml");
        Car obj = (Car) factory.getBean("car");
        obj.setBrand("brand");
        ((FileSystemXmlApplicationContext) factory).close();
    }
}
