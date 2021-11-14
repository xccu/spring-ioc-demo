package com.example.ioc.auto;

import com.alibaba.fastjson.JSON;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;

@SpringBootApplication
//@RequiredArgsConstructor
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    //字段注入
    /*@Autowired
    private Weslie weslie;
    @Autowired
    private Wolffy wolffy;*/


    //构造函数注入(一)
    /*private Weslie weslie;
    private Wolffy wolffy;
    @Autowired
    public Main(Weslie weslie,Wolffy wolffy){
        this.weslie = weslie;
        this.wolffy = wolffy;
    }*/

    //构造函数注入(二)
    /*private final Weslie weslie;
    private final Wolffy wolffy;*/

    //setter注入
    /*private Weslie weslie;
    private Wolffy wolffy;

    @Autowired
    public void setWeslie(Weslie weslie) {
        this.weslie = weslie;
    }

    @Autowired
    public void setWolffy(Wolffy wolffy) {
        this.wolffy = wolffy;
    }*/


    //使用接口
    @Qualifier("weslie")
    @Autowired
    private User user1;
    @Qualifier("wolffy")
    @Autowired
    private User user2;


    @Override
    public void run(String... args) throws Exception {
        JSON.toJSONString(user1);
        System.out.println("name:"+user1.getName()+"\trace:"+user1.getRace());
        System.out.println("name:"+user2.getName()+"\trace:"+user2.getRace());
    }
}
