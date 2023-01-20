package project.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
    拦截器
 */

@Component
public class ProjectInterceptor implements HandlerInterceptor {

    @Override   //原始操作运行前的代码
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String contentType = request.getHeader("Content-Type");
        System.out.println("preHandle.." + contentType);
        return true;  //false -> 终止原始操作，后续的原始操作及postHandle和afterCompletion都不会运行
    }

    @Override   //原始操作运行后的代码
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle..");
    }

    @Override   //在拦截操作之后且在postHandle后运行的代码
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion..");
    }

}
