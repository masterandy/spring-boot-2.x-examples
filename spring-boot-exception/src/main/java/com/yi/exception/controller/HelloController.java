package com.yi.exception.controller;

import com.yi.exception.handler.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 调用前端模板并返回数据
 * @author YI
 * @date 2018-8-21 09:50:09
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("say", "统一异常处理！！！");

        return "index";
    }
}
