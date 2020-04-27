package effctive;



//普通类的构造器  这样类的构造器 名字都是一样的 没有标识度
public class Woo {

    private String name;
    private int age;

    public Woo(String name, int age) {
        this.name = name;

        this.age = age;
    }

    /**
     * fdfdfdfdsfds
     * @param age
     */
    public Woo(int age) {
        this.age = age;
    }

    public Woo(String name) {
        this.name = name;
    }
    //静态工厂 创建 方法名字不同
    static Woo getNameInstance(String name){
        return new Woo(name);
    }
    static Woo getAgeInstance(int  age){
        return new Woo(1);
    }
    static Woo getInstance(String name, int  age){
        return new Woo("ab", 1);
    }
}
