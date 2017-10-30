package com.zuo.mosaic;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zuo.mosaic.config.MosaicApplication;


@SpringBootApplication
@MapperScan(basePackages="com.zuo.mosaic.backend.mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(MosaicApplication.class, args);
    }
}
