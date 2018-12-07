package com.starr.springbootdemo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     * @描述 :
     * @作者 :	lhw
     * @日期 :	2018/12/3
     * @时间 :	8:54
     * @param : []
     * @return : java.lang.String
     */
    @RequestMapping("hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
