package com.zs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zs
 * @create 2020-09-23 17:26
 */
@SpringBootApplication
@MapperScan("com.zs.mapper")
@EnableSwagger2
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
