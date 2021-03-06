package com.windmagics.ssmdemo.common;

public  class Result{

    public static final int SUCCESS = 0;
    public static final int FAILURE = 1;

    private int code = FAILURE;

    private String errmsg = "";

    private Object record;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Object getRecord() {
        return record;
    }

    public void setRecord(Object data) {
        this.record = data;
    }

    public static Result genSuccessResult(Object obj){
        Result result = new Result();
        result.code = SUCCESS;
        result.errmsg = "ok";
        result.record = obj;
        return result;
    }

    public static Result genFailedResult(String errmsg,Object obj)
    {
        Result result = new Result();
        result.code = FAILURE;
        result.errmsg = errmsg;
        result.record = obj;
        return result;
    }

}
