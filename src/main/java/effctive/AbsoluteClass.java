package effctive;

public abstract class AbsoluteClass {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public AbsoluteClass setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public AbsoluteClass setAge(int age) {
        this.age = age;
        return this;
    }
}
