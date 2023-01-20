package project.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component   //将当前类作为bean，供容器读取
@Aspect  //把当前类标识为一个切面，供容器读取
public class MyAdvice {

    //@Pointcut("execution(void project.dao.impl.BookDaoImpl.update())")
    //@Pointcut("execution(void project.dao.impl.BookDaoImpl.*())")
    @Pointcut("execution(int project.dao.impl.BookDaoImpl.select())")
    private void pt(){}

    /*@Before("pt()")
    public void before(){
        System.out.println("before...");
    }*/

    /*@After("pt()")
    public void after() {
        System.out.println("after...");
    }*/


    //原始操作无返回值
    /*@Around("pt()")  //环绕通知
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before....");
        //表示对原始操作的调用
        pjp.proceed();
        System.out.println("after....");
    }*/

    //原始操作有返回值
    @Around("pt()")  //环绕通知
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before....");
        //表示对原始操作的调用
        Object ret = pjp.proceed();
        System.out.println("after....");
        return ret;
    }



}
