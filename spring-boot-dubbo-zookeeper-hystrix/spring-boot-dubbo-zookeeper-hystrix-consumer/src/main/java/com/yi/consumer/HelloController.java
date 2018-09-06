package com.yi.consumer;

import com.yi.base.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消费者
 * @author YI
 * @date 2018-8-20 17:05:30
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    /**
     * localhost:8012/hello/xiaoming
     * @param name
     * @return
     */
    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name){
        return helloService.sayHello(name);
    }

    @GetMapping("goodbye/{name}")
    public String sayGoodbye(@PathVariable String name){
        return helloService.sayGoodbye(name);
    }
}
