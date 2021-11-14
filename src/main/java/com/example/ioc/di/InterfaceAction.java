package com.example.ioc.di;

public class InterfaceAction {

    private Login login;

    public void execute() {
        try {
            Object obj = Class.forName("com.example.ioc.di.LoginImpl").newInstance();
            login = (Login) obj;
            String name = login.getName();
            System.out.println("My Name Is " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}