package com.example.dblab;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dblab.*.mapper")
public class DbLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbLabApplication.class, args);
    }

}
