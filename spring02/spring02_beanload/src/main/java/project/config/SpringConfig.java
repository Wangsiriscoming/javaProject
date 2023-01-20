package project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = "project",   //扫描project包
                excludeFilters = @ComponentScan.Filter(   //设定排除扫描规则
                        type = FilterType.ANNOTATION,     //类型：排除注解类型
                        classes = Controller.class        //排除Controller注解的bean
                )
              )
public class SpringConfig {
}
