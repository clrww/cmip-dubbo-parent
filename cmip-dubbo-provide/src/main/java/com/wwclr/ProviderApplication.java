package com.wwclr;

//import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import tk.mybatis.spring.annotation.MapperScan;

@ImportResource("classpath:spring-mybatis.xml")      //导入xml配置
@MapperScan(basePackages = "com.wwclr.provide.mapper")
@ComponentScan(basePackages ={"com.wwclr.provide"} )
@SpringBootApplication
//@ComponentScan(basePackages ={"com.wwclr.provide","xxxx.xml"} )

public class ProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(ProviderApplication.class,args);
    }
}
