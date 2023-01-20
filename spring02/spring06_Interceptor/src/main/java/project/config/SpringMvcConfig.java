package project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import project.controller.interceptor.ProjectInterceptor;

@Configuration
@ComponentScan({"project.controller","project.config"})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {

    //也可以把ProjectInterceptor拦截器的代码写在此config中，前提是先实现WebMvcConfigurer
    //因为需要实现WebMvcConfigurer，所以该类与spring强绑定了，侵入式较强
    /*@Autowired
    private ProjectInterceptor projectInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books","/books/*");
        //先指定拦截器projectInterceptor，再规定何种请求会被拦截
    }*/
}
