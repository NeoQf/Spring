package io.github.neoqf.spring5.testdemo;


import io.github.neoqf.spring5.collectiontype.Course;
import io.github.neoqf.spring5.collectiontype.Stu;
import io.github.neoqf.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {

    @Test
    public void testCollection1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }
}
