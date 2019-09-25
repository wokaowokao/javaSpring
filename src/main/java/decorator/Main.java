package decorator;

public class Main {

    public static void main(String[] args) {
        //一个装饰器
        /*Man man = new Man();
        man.getName();
        new Decorator(new Man()).getName();*/
        //在子类的实例 上调用父类的方法 如果 子类实现了 会先调用子类的方法 再调用父类的方法
        Child child = new Child();
        child.getName();
        //测试单一继承
        //Chil2

    }
}
