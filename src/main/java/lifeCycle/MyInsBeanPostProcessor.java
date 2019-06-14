package lifeCycle;


import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * bean的后置处理器
 * 分别在bean的初始化前后对bean对象提供自己的实例化逻辑
 * postProcessAfterInitialization：初始化之后对bean进行增强处理
 * postProcessBeforeInitialization：初始化之前对bean进行增强处理
 *
 * @author LinJie
 */
public class MyInsBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("MyInsBeanPostProcessor->postProcessBeforeInstantiation");
        return null;
    }

    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("MyInsBeanPostProcessor->postProcessAfterInstantiation");

        return true;
    }

    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("MyInsBeanPostProcessor->postProcessPropertyValues");

        return pvs;
    }
}


