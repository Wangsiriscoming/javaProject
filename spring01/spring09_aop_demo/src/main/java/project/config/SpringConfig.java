package project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("project")
@EnableAspectJAutoProxy  //启动aspectj自动代理
public class SpringConfig {
}
