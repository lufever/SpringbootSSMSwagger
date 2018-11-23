package com.windmagics.ssmdemo.service;
import com.windmagics.ssmdemo.common.Result;
import org.springframework.stereotype.Service;


public interface QuestionService {
    public Result getQuestions();
    public Result getQuestion(int id);
    public Result getPre(int id);
    public Result getNext(int id);
}
