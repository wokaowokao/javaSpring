package effctive;

import java.util.HashMap;

public class Main2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        //= 是一摸一样的类
//        ForClone forClone = new ForClone();
//        forClone.setAge(1);
//        ForClone forClone2 = forClone;
//        forClone2.setAge(2);
//        System.out.println(forClone.getAge());
//
//        //此方式 copy、 是一个新的类
//        ForClone forClone3 = forClone.clone();
//        forClone3.setAge(3);
//        System.out.println(forClone.getAge());
//
//        Foo ab = new Foo("ab");
//        forClone.setFoo(ab);
//
//        System.out.println(forClone.getFoo().hashCode());
//        System.out.println(forClone2.getFoo().hashCode());
        //抽象类不能实例化
        //AbsoluteClass absoluteClass = new AbsoluteClass();


        //编译不报错 但是Operation2 写法可以避免此情况
        double x = 1.1;
        double y = 2.2;
        double result = Operation.FOO.apply(x, y);
        final double apply = Operation2.PLUS.apply(x, y);

         System.out.println(result);


    }
}
