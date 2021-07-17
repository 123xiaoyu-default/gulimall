package com.atguigu.gulimall.product.exception;

import com.atguigu.gulimall.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: xiaoYu
 * @Date: 2021/6/25 19:56
 * @Description: 集中处理所有异常
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.atguigu.gulimall.product.controller")
public class GuLiMallExceptionControllerAdvice {

    //告诉程序这个方法能处理什么异常
    @ExceptionHandler(value = Exception.class)
    public R handValidException(Exception e){
        log.error("数据校验出现问题{},异常类型{}",e.getMessage(),e.getClass());
        return R.error();
    }
}