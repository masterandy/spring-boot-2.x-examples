package com.yi.memcached.annotation;

import com.yi.memcached.config.MemcachedAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 通过注解启动配置
 * @author YI
 * @date 2018-10-16 14:36:49
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({ MemcachedAutoConfiguration.class })
@Documented
public @interface EnableMemcached {

}
