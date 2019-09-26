package effctive;

/**
 * 加减乘除枚举
 * Created by yulinfeng on 8/20/17.
 */
public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE,FOO;

    double apply(double x, double y) {
        switch (this) {
            case PLUS: return x + y;
            case MINUS: return x - y;
            case TIMES: return x * y;
            case DIVIDE: return x / y;
        }
        throw new AssertionError("Unknow op:" + this);
    }
}