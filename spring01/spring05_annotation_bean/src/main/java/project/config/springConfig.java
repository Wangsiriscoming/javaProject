package project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*代替applicationContext.xml的作用，作为一个配置文件，起到纯注解开发的作用*/
@Configuration  //设定当前类为配置类
@ComponentScan("project")  //设定扫描路径  多个路径：@ComponentScan({"project","..",..})
public class springConfig {
}
