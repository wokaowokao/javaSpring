package effctive;

public class ForClone  implements Cloneable{
    private String name;
    private int age;
    private Woo woo;

    public Woo getWoo() {
        return woo;
    }

    public ForClone setWoo(Woo woo) {
        this.woo = woo;
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
