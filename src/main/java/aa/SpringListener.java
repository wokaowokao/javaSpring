package aa;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class SpringListener implements ApplicationListener<ContextRefreshedEvent> {
    //可以 再spring 上下文加载完之后 执行
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //System.out.println("1231231231");
    }
}
