package interfaceInject;

import org.springframework.stereotype.Service;

@Service
public class Man implements Person{
    private int a = 1;
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
