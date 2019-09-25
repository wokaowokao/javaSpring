package finalTest;

import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //final asList 是Array内部类 ArrayList 没有add方法 所以报错
        List<String> list = Arrays.asList("aa", "bb");
        //list.add("dfd");



        final int ab = 12;
        //final 基本类型 修改时 编译都不会通过
        //ab = ab + 1;

        //final set list可以修改
        final List<String> list2 = new ArrayList<String>();
        list2.add("aa");
        list2.add("bb");
        final Set<String> MConfigLocations = Sets.newHashSet("aa.properties");

        System.out.println("sf");
    }
}
