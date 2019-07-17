package com.suxiaowei.mysqlclient.controller;

import com.suxiaowei.mysqlclient.commonEntity.Result;
import com.suxiaowei.mysqlclient.commonEntity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author suxiaowei
 * @Company
 */
@ControllerAdvice
//@RestControllerAdvice
public class BaseExceptionHandler{

    /**
     * 处理异常的方法
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        return new Result(false, StatusCode.ERROR,"执行失败 ",e.getMessage());
    }
}
