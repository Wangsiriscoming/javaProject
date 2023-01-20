package project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("project")
@Import(JdbcConfig.class)  //将第三方的配置类导入
public class SpringConfig {
}
