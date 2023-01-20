package project.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("project")
@PropertySource("classpath:Jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
