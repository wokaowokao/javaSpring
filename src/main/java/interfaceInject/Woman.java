package interfaceInject;

import org.springframework.stereotype.Service;

@Service
public class Woman implements Person{
    private int a = 2;
    @Override
    public void getName() {
        System.out.println("dfd");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
