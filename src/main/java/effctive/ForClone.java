package effctive;

public class ForClone  implements Cloneable{
    private String name;
    private int age;
    private Foo foo;

    public Foo getFoo() {
        return foo;
    }

    public ForClone setFoo(Foo foo) {
        this.foo = foo;
        return this;
    }

    public String getName() {
        return name;
    }

    public ForClone setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public ForClone setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public ForClone clone() throws CloneNotSupportedException {
        return (ForClone)super.clone();
    }
}
