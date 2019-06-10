import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JDKMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //利用 反射创建类 以及调用类的方法
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("HelloWorld");

        Constructor declaredConstructor = clazz.getDeclaredConstructor((Class[]) null);
        //实例化类 会初始化类会调用 static代码块儿
        //类 直接调用 间接调用
        //直接调用 会触发类的初始化 会执行static代码块   new 反射实例 调用静态方法 调用静态值
        //间接调用 不会执行static 调用父类的静态 数组调用 静态常量
        HelloWorld helloWorld = (HelloWorld) declaredConstructor.newInstance();


        Method setMessage = clazz.getMethod("setMessage", String.class);

        //getMethod 只获取public修饰方法
        //Method getMeasage = clazz.getMethod("getMessage");

        Method getMeassage = clazz.getDeclaredMethod("getMessage",(Class[])null);
        //可以调用 private的方法
        getMeassage.setAccessible(true);


        setMessage.invoke(helloWorld, "dfd");
        getMeassage.invoke(helloWorld);

    }
}
