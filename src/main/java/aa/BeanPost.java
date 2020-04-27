package aa;

import com.google.common.collect.Lists;
import java.lang.reflect.Field;
import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPost implements BeanPostProcessor {
    //实现所有的bean的 切面
    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {

        List<Field> fields = Lists.newArrayList(bean.getClass().getDeclaredFields());
        fields.stream().forEach(i-> {
            if(i.isAnnotationPresent(ZYW.class)){
                try {
                    ZYW annotation = i.getAnnotation(ZYW.class);

                    i.set(bean, annotation.value());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        //System.out.println(o.getClass());
        //System.out.println("222");
        return o;
    }
}
