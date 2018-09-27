package com.windmagics.ssmdemo.controller;



import com.windmagics.ssmdemo.common.Result;
import com.windmagics.ssmdemo.dao.QuestionMapper;
import com.windmagics.ssmdemo.model.Question;
//import com.windmagics.ssmdemo.model.User;
import com.windmagics.ssmdemo.service.QuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.ws.Response;


@Api(tags = "测试", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@EnableAutoConfiguration
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

//    //依赖注入
//    @Autowired
//    QuestionMapper questionMapper;
    @ApiOperation(value = "获取用户", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = {@ApiResponse(code = 0, message = "ok", response = Response.class)})
    @GetMapping("getuser")
    public int getuser() {
        return 1;
    }

//    @GetMapping("getquestions")
//    public Question getQuestions()
//    {
//        return questionMapper.selectByPrimaryKey(6);
//
//       //return  questionMapper.selectByPrimaryKey(6);
//    }

    @GetMapping("getquestions")
    public Result getQuestions() {
        return  questionService.getQuestions();
    }
//    @GetMapping("getquestions")
//    public Result getQuestions() {
//        return  questionService.getQuestions();
//        }
}