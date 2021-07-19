import com.odas.dao.UserDaoOracleImpl;
import com.odas.service.UserService;
import com.odas.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的是业务层，dao层他们不需要接触
        UserService userService = new UserServiceImpl();

        // 只需要调相关的实现类就行了，dao层的代码是不需要改的
        // 也就是说只要控制层去改动，去调用相关代码就行了(顺带这个MyTest类就是控制层)
        // 注意：这里有一个强制转换
        ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());
        userService.getUser();

        // ======================== 分割线 ===============================
        // 但是一旦我们使用bean之后，上面的方法就不需要使用啦

        // 获取ApplicationContext，通过配置文件(beans.xml)来拿到spring的容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 容器在手，天下我有，需要什么，就直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
