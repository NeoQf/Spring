package io.github.neoqf.spring5.testdemo;

import io.github.neoqf.spring5.bean.Emp;
import io.github.neoqf.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LQF
 */
public class TestBean {

    @Test
    public void testBean1() {
        // 1、加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        // 2、获取通过配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testBean2() {
        // 1、加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");

        // 2、获取通过配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.add();
    }
}
