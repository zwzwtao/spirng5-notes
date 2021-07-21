import com.odas.config.OdasConfig;
import com.odas.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void myTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(OdasConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
