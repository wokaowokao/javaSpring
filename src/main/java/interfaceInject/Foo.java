package interfaceInject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Foo {


    @Autowired
    private Aa aa;

    @Autowired
    List<Person> list;

    public Aa getAa() {
        return aa;
    }
}
