package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zhangyawei Created on 2020/1/23.
 */
public class SuperReflect {

    public static void main(String[] args)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //缓存  Class
        Class fooClass = Class.forName("Foo");
        int i = -20;
        while (i > 0) {
            Object o = fooClass.newInstance();
            i++;
        }
        //不缓存  Class
        int i2 = -20;
        while (i2 > 0) {
            Object o = Class.forName("Foo").newInstance();
            i++;
        }

        Foo oo = (Foo) fooClass.newInstance();
        //缓存 Method
        Method p = fooClass.getMethod("print");
        int i3 = -20;
        while (i3 > 0) {
            p.invoke(oo);
            i3++;
        }
        //不缓存 Method
        int i4 = -20;
        while (i4 > 0) {
            fooClass.getMethod("print").invoke(oo);
            i4++;
        }
    }
}
