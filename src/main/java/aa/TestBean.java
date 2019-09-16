package aa;

public class TestBean {

    @ZYW("bbb")
    public String name;
    public Integer age;

    public String getName() {
        return name;
    }

    public TestBean setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public TestBean setAge(Integer age) {
        this.age = age;
        return this;
    }
}
