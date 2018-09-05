package com.yi.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 提供者
 * @author YI
 * @date 2018-8-20 16:38:27
 */
@SpringBootApplication
@ImportResource(value = { "classpath:providers.xml" })
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
