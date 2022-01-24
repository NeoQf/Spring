package io.github.neoqf.spring5.testdemo;

import io.github.neoqf.spring5.Book;
import io.github.neoqf.spring5.Orders;
import io.github.neoqf.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LQF
 */
public class TestSpring5 {

    @Test
    public void testAdd() {
        // 1、加载spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取通过配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println();
        book.testDemo();
    }

    @Test
    public void testOrders() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.ordersTest();
    }
}
