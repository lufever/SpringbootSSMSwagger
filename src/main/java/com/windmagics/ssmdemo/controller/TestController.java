package com.windmagics.ssmdemo.controller;


import com.windmagics.ssmdemo.model.Test;
import com.windmagics.ssmdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 【swg】.
 * @Date 2017/11/26 10:04
 * @DESC
 * @CONTACT 317758022@qq.com
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/testTra")
    public Test testTra(){
        return testService.testTra();
    }
}
