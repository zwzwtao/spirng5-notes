import com.odas.pojo.User;
import com.odas.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 注意这里在配置文件加载的时候，容器中管理的对象就已经初始化了
        // 下面这一行语句一执行就会打印出"UserT is constructed"
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserT user = (UserT) context.getBean("u2");
        user.show();
    }
}
