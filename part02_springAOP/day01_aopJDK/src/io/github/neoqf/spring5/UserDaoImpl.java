package io.github.neoqf.spring5;

// 后续需要使用JDK代理对象对其进行增强
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
