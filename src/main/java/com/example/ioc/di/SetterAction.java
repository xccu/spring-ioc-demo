package com.example.ioc.di;

/**
 * setter注入
 */
public class SetterAction {

    private Login login;

    public void execute() {
        String name = login.getName();
        System.out.println("My Name Is " + name);
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}