package com.odas.mapper;

import com.odas.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    // 添加了一个用户
    int addUser(User user);

    // 删除一个用户
    int deleteUser(int id);
}
