package decorator;

public class Base2 {

    void getAge() {
        System.out.println("base age: 100");
    }

    void getName() {
        System.out.println("base name: base");
        getAge();
    }
}
