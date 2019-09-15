package invokeSort;

public class Test {

    static Test test = new Test();
    int a = print("aaa");
    static int b = print("000");
    {
        System.out.println("bbb");
    }
    Test(){
        System.out.println("ddd");
    }
    {
        System.out.println("ccc");
    }
    static {
        System.out.println("111");
    }
    public static int print(String aa){
        System.out.println(aa);
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("222");
        Test ab = new Test();
        Test bb = new Test();
    }
}
//先执行类的初始化 执行类 static变量 static方法
//执行 {}代码块 构造方法
/*
        aaa
        bbb
        ccc
        ddd

        000
        111
        222

        aaa
        bbb
        ccc
        ddd

        aaa
        bbb
        ccc
        ddd
        */
