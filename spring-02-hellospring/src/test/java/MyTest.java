import com.odas.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取 spring 的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们现在的对象都在 spring 中管理了，我们要使用，直接去里面取出来就可以了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
