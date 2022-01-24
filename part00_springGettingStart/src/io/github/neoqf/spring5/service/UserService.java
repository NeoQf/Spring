package io.github.neoqf.spring5.service;

import io.github.neoqf.spring5.dao.UserDao;
import io.github.neoqf.spring5.dao.UserDaoImpl;

public class UserService {

    // 创建UserDao类属性，生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    // 需求：service调用dao中的方法
    public void add() {
        System.out.println("service add...........");

        // 原始方式：创建UserDao对象
        /*UserDao userDao = new UserDaoImpl();
        userDao.update();*/
        userDao.update();
    }
}
