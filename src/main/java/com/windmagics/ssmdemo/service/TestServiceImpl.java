package com.windmagics.ssmdemo.service;


import com.windmagics.ssmdemo.model.Test;
import org.apache.ibatis.io.ResolverUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 【swg】.
 * @Date 2017/11/26 10:02
 * @DESC
 * @CONTACT 317758022@qq.com
 */
@Service
public class TestServiceImpl implements TestService{

    @Transactional
    @Override
    public Test testTra() {
        Test test1 = new Test();
        test1.setId(4);
        test1.setName("hh");
        test1.setAge(12);

    return test1;


    }
}
