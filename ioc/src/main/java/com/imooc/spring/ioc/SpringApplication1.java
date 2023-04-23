package com.imooc.spring.ioc;

import com.imooc.spring.ioc.entity.Apple;
import com.imooc.spring.ioc.entity.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication1 {
    public static void main(String[] args) {
        //创建Spring IOC容器,并根据配置文件在容器中实例化对象
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext1.xml");
        Apple sweetApple = context.getBean("sweetApple", Apple.class);
        System.out.println(sweetApple.getTitle());

        //从IOC容器中提取beanId = lily 的对象
        Child lily = context.getBean("lily",Child.class);
        lily.eat();
        Child andy = context.getBean("andy",Child.class);
        andy.eat();
        Child luna = context.getBean("luna",Child.class);
        luna.eat();
    }
}
