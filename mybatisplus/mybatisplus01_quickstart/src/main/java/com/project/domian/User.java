package com.project.domian;

import lombok.*;

//lombok
/*@Setter //setter方法注解
@Getter  //getter方法注解
@ToString  //覆盖toString方法注解
@NoArgsConstructor  //无参构造方法注解
@AllArgsConstructor  //有参构造方法注解
@EqualsAndHashCode  //覆盖Equals和HashCode方法注解*/
@Data  //包括以上除构造方法外的其他注解
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;


}
