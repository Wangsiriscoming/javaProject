package project.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import project.dao.BookDao;

import javax.sql.DataSource;

public class JdbcConfig {

    //第三方bean依赖注入
    @Value("com.mysql.cj.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/db1?useSSL=false&amp;characterEncoding=utf-8&amp;serverTimezone=Asia/Shanghai")
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;


    //1.定义一个方法获得要管理的对象
    //2.添加@Bean，表示当前方法的返回值是一个bean
    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);  //第三方bean依赖注入时，发现需要BookDao类型的参数，于是扫描ComponentScan路径下是否有符合类型的参数并自动装配上
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
