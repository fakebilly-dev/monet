package com.fakebilly.monet.basic;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Application
 * @author FakeBilly
 * @version V1.0.0
 * @github https://github.com/fakebilly1us/monet
 **/
@SpringBootApplication(scanBasePackages = {"com.fakebilly.monet"})
@NacosPropertySource(dataId = "system", groupId = "BASIC-SERVICE", autoRefreshed = true)
@MapperScan("com.fakebilly.monet.basic.infrastructure.mapper")
@EnableTransactionManagement
@EnableConfigurationProperties
@EnableAsync
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
