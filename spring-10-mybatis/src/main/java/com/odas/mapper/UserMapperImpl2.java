package com.odas.mapper;

import com.odas.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

// 使用继承 SqlSessionDaoSupport 的做法更加多
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    public List<User> selectUser() {
        // 调用 SqlSessionDaoSupport 里的 getSqlSession() 方法
        // 你会得到一个 SqlSessionTemplate，之后可用于执行SQL方法
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();

        // 当然之后推荐写到一行，因为这样比较帅
        // return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
