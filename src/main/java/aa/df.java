package aa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyawei Created on 2020/6/2.
 */
public class df {
    public static void main(String[] args) {
        List<? extends Father> list = new ArrayList<>();

        List<? super Father> list1 = new ArrayList<>();
        list1.add(new Father());
    }
    static void add(Father a){

    }
}
