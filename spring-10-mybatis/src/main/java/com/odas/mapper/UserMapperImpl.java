package com.odas.mapper;

import com.odas.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    // 我们原来的所有操作，都使用sqlSession来执行，现在就都是使用SqlSessionTemplate了
    private SqlSessionTemplate sqlSession;

    // 暂时还不明白为什么这里一定要一个set方法
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
