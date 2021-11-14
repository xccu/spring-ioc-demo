package com.example.ioc.di;

/**
 * 构造方法注入
 */
public class ConstructorAction {

    private Login login;

    public ConstructorAction(Login login) {
        this.login = login;
    }

    public void execute() {
        String name = login.getName();
        System.out.println("My Name Is " + name);
    }
}