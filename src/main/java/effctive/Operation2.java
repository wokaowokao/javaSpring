package effctive;

/**
 * 加减乘除枚举
 * Created by yulinfeng on 8/20/17.
 */
/**
 * 加减乘除枚举
 * Created by yulinfeng on 8/20/17.
 */
public enum Operation2 {
    PLUS {
        double apply(double x, double y) {
            return x + y;
        }
    },
    MIUS {
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        double apply(double x, double y) {
            return x * y;
        }
    },
    DEVIDE {
        double apply(double x, double y) {
            return x / y;
        }
    };

    abstract double apply(double x, double y);
}