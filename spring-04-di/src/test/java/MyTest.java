import com.odas.pojo.Student;
import com.odas.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
        // 这里也可以在第二个参数位置填写 User.class 使用反射来定义类的名字
        User user = context.getBean("user", User.class);

    }

}

