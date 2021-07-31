import com.odas.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 注意这里虽然注册的bean是UserServiceImpl的类的，但是class是UserService.class，是接口类的
        // 注意点: 动态代理代理的是接口, 可以回去看InvocationHandler那一章
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
