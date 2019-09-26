package effctive;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //构造器
        new Foo("ab");
        //静态工厂 Executors类，在这个类中有newFixedThread、newSingleThreadExecutor、newCachedThreadPool
        Foo ageInstance = Foo.getAgeInstance(1);


        Map<String, List<String>> m = new HashMap<String, List<String>>();
        Map<String, List<String>> mb = new HashMap<>();
        //枚举单例
        Instance instance = Instance.INSTANCE;



    }
}
