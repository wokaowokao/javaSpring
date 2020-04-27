package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zhangyawei Created on 2020/1/23.
 */
public class Rel {

    public static void main(String[] args)
            throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //Class类提供了这样一个方法，让我们通过类名来获取到对象类
        Class<?> fooClass = Class.forName("Foo");
        Foo foo1 = (Foo)fooClass.newInstance();

        Method getMethod = fooClass.getMethod("print");
        Object invoke2 = (Object) getMethod.invoke(foo1);
    }

}
