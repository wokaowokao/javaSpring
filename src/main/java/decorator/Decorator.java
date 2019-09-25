package decorator;

public class Decorator {
    private Person person;
    Decorator(Person person){
        this.person = person;
    }

    void getName() {
        System.out.println("装饰过的");
        person.getName();
    }

}
