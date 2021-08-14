package com.odas.mapper;

import com.odas.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    // 添加了一个用户
}
