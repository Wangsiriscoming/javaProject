package project.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* project.dao.BookDao.findName(..))")
    private void pt(){}

//    @Before("pt()")
    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice...");
    }

//    @After("pt()")
    public void after(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice...");
    }

    @Around("pt()")   //ProceedingJoinPoint是JoinPoint的子类，因此也有其getArgs方法
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666;  //此步骤可以将传进来的参数修改，并将修改完的参数赋予到下一步的原始操作中
        Object ret = pjp.proceed(args);
        return ret;
    }

//    @AfterReturning(value = "pt()", returning = "ret")  //原始操作若有return，则可以将return内容拿过来作为参数使用
    public void afterReturning(JoinPoint jp,Object ret){  //jp必须作为第一位参数，否则会报参数错误
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("afterReturning advice..." + ret);
    }

//    @AfterThrowing("pt()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice...");
    }

}
