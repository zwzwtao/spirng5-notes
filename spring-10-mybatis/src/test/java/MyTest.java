import com.odas.mapper.UserMapper;
import com.odas.pojo.User;
import com.odas.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
