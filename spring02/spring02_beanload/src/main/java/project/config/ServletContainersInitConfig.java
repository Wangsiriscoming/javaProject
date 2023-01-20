package project.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//定义一个servlet容器启动的配置类，在里面加载spring的配置
/*public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {


    //加载springmvc容器配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //初始化servlet容器
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //将配置类上传至容器
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    //设置哪些请求归属springmvc处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};   //  "/" -> 规定所有程序
    }


    //加载spring容器配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        //初始化servlet容器
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //将配置类上传至容器
        ctx.register(SpringConfig.class);
        return ctx;
    }
}*/

//简化版
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
