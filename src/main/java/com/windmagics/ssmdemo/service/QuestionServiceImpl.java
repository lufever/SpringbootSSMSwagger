package com.windmagics.ssmdemo.service;


import com.alibaba.fastjson.JSONObject;
import com.windmagics.ssmdemo.common.Result;
import com.windmagics.ssmdemo.dao.QuestionMapper;
import com.windmagics.ssmdemo.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Override
    public Result getQuestions() {
        List<Map< String, Object >>questions= questionMapper.selectAll();
        List<JSONObject> jsonList = Question.genJSONList(questions);
        return Result.genSuccessResult(jsonList);
    }
//    @Override
//    public Result getQuestion(int id) {
//        Question question= questionMapper.selectByPrimaryKey(id);
//        JSONObject json = question.genJSONObj();
//        return Result.genSuccessResult(json);
//    }
    @Override
    public Result getQuestion(int id) {
        Question question= questionMapper.selectByPrimaryKey(id);
        Map<String,Object> pre= questionMapper.selectPre(id);
        Map<Integer,String> next= questionMapper.selectNext(id);

         JSONObject  json = question.genJSONObj();
         json.put("pre",pre);
         json.put("next",next);
        return Result.genSuccessResult(json);
    }

    @Override
    public Result getPre(int id) {
        Map<String,Object> pre= questionMapper.selectPre(id);
        JSONObject json =  JSONObject.parseObject(JSONObject.toJSONString(pre));
        return Result.genSuccessResult(json);
    }

    @Override
    public Result getNext(int id) {
        Map<Integer,String> next= questionMapper.selectNext(id);
        JSONObject json =  JSONObject.parseObject(JSONObject.toJSONString(next));
        return Result.genSuccessResult(json);
    }
}
