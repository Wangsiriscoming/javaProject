package project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("project")
@PropertySource("jdbc.properties")  //加载属性文件（多个属性源：@PropertySource({"jdbc.properties","jdbc2.properties",..})
public class SpringConfig {
}
