package imooc.spring.ioc;

import imooc.spring.ioc.context.ApplicationContext;
import imooc.spring.ioc.context.ClassPathXmlApplicationContext;
import imooc.spring.ioc.entity.Apple;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Apple apple = (Apple)context.getBean("sweetApple");
        System.out.println(apple);
    }
}
