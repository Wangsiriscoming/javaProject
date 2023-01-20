package project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project.config.SpringConfig;
import project.service.ResourcesService;
/*
    密码输入可能会带空格，此案例目的是将输入的字符串中的空格通过trim()剔除掉
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService = ctx.getBean(ResourcesService.class);
        boolean flag = resourcesService.openURL("http://pan.baidu.com/haha","root ");
        System.out.println(flag);
    }
}
