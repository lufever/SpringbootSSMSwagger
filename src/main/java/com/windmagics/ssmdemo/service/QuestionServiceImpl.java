package com.windmagics.ssmdemo.service;


import com.alibaba.fastjson.JSONObject;
import com.windmagics.ssmdemo.common.Result;
import com.windmagics.ssmdemo.dao.QuestionMapper;
import com.windmagics.ssmdemo.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Override
    public Result getQuestions() {
        List<Question> questions = new ArrayList<>();
        Question question = questionMapper.selectByPrimaryKey(6);
        questions.add(question);
        List<JSONObject> jsonList = Question.genJSONList(questions);
        return Result.genSuccessResult(jsonList);
    }
}
