package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class UserMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = (User) ctx.getBean("user");
        System.out.println(user);
        user.setName("Jack");
        System.out.println(user);
    }
}
