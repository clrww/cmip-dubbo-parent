package com.wwclr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by xebest on 2018/1/4.
 */
//@ImportResource("classpath:application.properties")      //导入xml配置


@ImportResource("classpath:spring-hibernate.xml")      //导入xml配置
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(ProviderApplication.class,args);
    }
}
