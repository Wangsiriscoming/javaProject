package project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("project.controller")
@EnableWebMvc  //开启json数据进行自动类型转换
public class SpringMvcConfig {
}
