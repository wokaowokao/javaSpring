import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;



/*DefaultListableBeanFactory

BeanFactory接口 子类：
        ListableBeanFactory
            表示这些 Bean 是可列表的
        HierarchicalBeanFactory
            表示的这些 Bean 是有继承关系的，也就是每个 Bean 有可能有父 Bean
        AutowireCapableBeanFactory
            定义 Bean 的自动装配规则


从上图中可以看出 ApplicationContext 继承了 BeanFactory，
        这也说明了 Spring 容器中运行的主体对象是 Bean，
        另外 ApplicationContext 继承了 ResourceLoader 接口使得 ApplicationContext 可以访问到任何外部资源，这将在 Core 中详细说明。

        ApplicationContext 的子类主要包含两个方面：

        ConfigurableApplicationContext 表示该 Context 是可修改的，
        也就是在构建 Context 中用户可以动态添加或修改已有的配置信息，它下面又有多个子类，其中最经常使用的是可更新的 Context，
        即 AbstractRefreshableApplicationContext 类。
        WebApplicationContext 顾名思义，就是为 web 准备的 Context 他可以直接访问到 ServletContext，通常情况下，这个接口使用的少。*/
/*
但是从上图中我们可以发现最终的默认实现类是 DefaultListableBeanFactory，实现了所有的接口。
那为何要定义这么多层次的接口呢？查阅这些接口的源码和说明发现，每个接口都有使用的场合，它主要是为了区分在 Spring 内部对象的传递和转化过程中，对对象的数据访问所做的限制。
例如 ListableBeanFactory 接口表示这些 Bean 是可列表的，而 HierarchicalBeanFactory 表示的这些 Bean 是有继承关系的，也就是每个 Bean 有可能有父 Bean。
AutowireCapableBeanFactory 接口定义 Bean 的自动装配规则。
这四个接口共同定义了 Bean 的集合、Bean 之间的关系、以及 Bean 行为*/
public class Main {
    public static void main(String[] args) {

        //Resource 从 ->ClassPathResource
        // Beans
        //Context 提供bean环境 获取bean->XmlBeanFactory

        // 是Resouce的实现类
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        /*obj.getMessage();*/
    }
}
