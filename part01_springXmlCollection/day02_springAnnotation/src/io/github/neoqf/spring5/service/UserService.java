package io.github.neoqf.spring5.service;


import io.github.neoqf.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 在注解中：value属性值可省略不写
 * 默认值是类名称，首字母小写
 * UserService -- userService
 * @author LQF
 */
@Service    //<bean id="userService" class=".."/>
public class UserService {

    @Value(value = "abc")   // 其实就是使用value注解去替代之前
                            // 在.xml文件中的property标签，
                            // 从这里也能看出注解的实际作用
    private String name;

    // 定义dao类型属性
    // 不需要添加set方法
    // 添加注入属性注解
    /*@Autowired  // 根据类型进行注入
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;*/

//    @Resource   // 根据类型进行注入
    @Resource(name = "userDaoImpl")   // 根据名称进行注入
    private UserDao userDao;

    public void add() {
        System.out.println("service add........." + name);
        userDao.add();
    }
}
