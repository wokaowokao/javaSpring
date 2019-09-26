package effctive;



//普通类的构造器  这样类的构造器 名字都是一样的 没有标识度
public class Foo {

    private String name;
    private int age;

    public Foo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Foo(int age) {
        this.age = age;
    }

    public Foo(String name) {
        this.name = name;
    }
    //静态工厂 创建 方法名字不同
    static Foo getNameInstance(String name){
        return new Foo(name);
    }
    static Foo getAgeInstance(int  age){
        return new Foo(1);
    }
    static Foo getInstance(String name, int  age){
        return new Foo("ab", 1);
    }
}
