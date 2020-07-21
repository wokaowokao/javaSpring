package exception;

/**
 * @author zhangyawei Created on 2019/11/17.
 */
public class Main {

    public static void main(String[] args) {

        foo();
    }

    private static void foo() {

        throw new AException();
    }

}
