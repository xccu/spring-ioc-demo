package com.example.ioc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // 得到ApplicationContext对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Setter注入
        SetterAction setterAction = (SetterAction) ctx.getBean("setterAction");
        setterAction.execute();

        //构造函数注入
        ConstructorAction constructorAction = (ConstructorAction) ctx.getBean("constructorAction");
        constructorAction.execute();

        //接口注入
        InterfaceAction interfaceAction = (InterfaceAction) ctx.getBean("interfaceAction");
        interfaceAction.execute();
    }
}