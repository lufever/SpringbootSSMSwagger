package com.windmagics.ssmdemo.model;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question {
    private Integer id;

    private String title;

    private String category;

    private Date createtime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    private JSONObject genJSONObj() {
        try {
            JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(this));
            return jsonObject;
        }
        catch (Exception e){
            return null;
        }
    }

    public static List<JSONObject> genJSONList(List<Question> models)
    {
        List<JSONObject> jsonObjects = new ArrayList<>();
        for (Question model:models)
        {
            JSONObject jsonObject = model.genJSONObj();
            if (jsonObject != null)
                jsonObjects.add(jsonObject);
        }
        return jsonObjects;
    }
}