package lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by 张亚威 on 2019-06-14 下午 1:45.
 */
public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {


    private String brand;

    private BeanFactory beanFactory;
    private String beanName;

    public Car(){
        System.out.println("car 构造");
    }
    public void setBrand(String brand){
        System.out.println("setBrand");
        this.brand = brand;
    }
    public void initCar(){
        System.out.println("initCar");
    }
    public void destroyCar(){
        System.out.println("destroyCar");
    }
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware->setBeanFactory");

    }

    public void setBeanName(String s) {
        System.out.println("BeanNameAware->setBeanName");

    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean->destroy");

    }

    public void afterPropertiesSet() throws Exception {

        System.out.println("InitializingBean->afterPropertiesSet");

    }
}
