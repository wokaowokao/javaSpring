package decorator;

public class Child extends Base {

    @Override
    void getAge() {
        System.out.println("child age: 1");
        super.getAge();
    }

    @Override
    void getName() {
        System.out.println("child name: child");
        super.getName();
    }
}
