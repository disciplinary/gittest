package com.gittest.controller;

import com.gittest.common.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>todo</p>
 *
 * @author syw
 * @version $Id: HelloController, v 0.1 2018/12/26 15:38 syw Exp $
 */
@Controller
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    //对应的自定义注解，当方法上写这个注解时，就会进入切面类中
    @Log(title="哈喽模块",action="say哈喽")
    public String sayHello() {
        log.info("HelloController sayHello:{}","hello world!");
        return "hello";
    }
}
