package lifeCycle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean的后置处理器
 * 分别在bean的初始化前后对bean对象提供自己的实例化逻辑
 * postProcessAfterInitialization：初始化之后对bean进行增强处理
 * postProcessBeforeInitialization：初始化之前对bean进行增强处理
 *
 * @author LinJie
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    //对初始化之后的Bean进行处理
    //参数：bean：即将初始化的bean
    //参数：beanname：bean的名称
    //返回值：返回给用户的那个bean,可以修改bean也可以返回一个新的bean
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException {
        System.out.println("MyBeanPostProcessor->postProcessAfterInitialization");

            Car stu = null;
            if("name".equals(beanname) || bean instanceof Car) {
                stu = (Car) bean;

            }
            return stu;
    }

    //对初始化之前的Bean进行处理
    //参数：bean：即将初始化的bean
    //参数：beanname：bean的名称
    //返回值：返回给用户的那个bean,可以修改bean也可以返回一个新的bean
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException {
        System.out.println("MyBeanPostProcessor->postProcessBeforeInitialization");
        return bean;
    }

}


