package com.odas.service;

import com.odas.dao.UserDao;
import com.odas.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    // 如果按照以下的形式写的话，如果客户提不同的需求，就会去new不同的impl类，会非常麻烦
    // private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    // 利用set进行动态实现值的注入，这样的好处是新增了需求就不用动这块的代码了
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
