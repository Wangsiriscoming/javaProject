package project.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import project.exception.BusinessException;
import project.exception.SystemException;

/*
    异常处理器
 */
@RestControllerAdvice  //可以用于定义@ExceptionHandler、@InitBinder、@ModelAttribute，并应用到所有@RequestMapping中
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)  //拦截异常
    public Result doSystemException(SystemException ex) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)  //拦截异常
    public Result doBusinessException(BusinessException ex) {

        return new Result(ex.getCode(),null,ex.getMessage());

    }

    @ExceptionHandler(Exception.class)  //拦截异常
    public Result doException(Exception ex) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发
        return new Result(Code.SYSTEM_UNKNOWN_ERR,null,"系统繁忙，请稍后再试!");
    }

}
