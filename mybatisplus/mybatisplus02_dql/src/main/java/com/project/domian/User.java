package com.project.domian;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

//lombok
/*@Setter //setter方法注解
@Getter  //getter方法注解
@ToString  //覆盖toString方法注解
@NoArgsConstructor  //无参构造方法注解
@AllArgsConstructor  //有参构造方法注解
@EqualsAndHashCode  //覆盖Equals和HashCode方法注解*/
@Data  //包括以上除构造方法外的其他注解
//@TableName(value = "tbl_user")  //映射关系，若实体类与数据库表名不一致，需添加此注解进行绑定（也可以在yml中进行全局配置）
public class User {
//    @TableId(type = IdType.AUTO)  //自增id
//    @TableId(type = IdType.INPUT)  //手动setter id
//    @TableId(type = IdType.ASSIGN_ID)  //雪花算法生成id  //@TableId也可以在yml中进行全局配置
    private Long id;
    private String name;
    @TableField(value = "pwd",select = false)  //若实体类中的某些字段与数据库的字段不一致，需添加此注解进行声明
    private String password;                   //select = false  -->  不想查询该字段信息
    private Integer age;
    private String tel;


    @TableField(exist = false)  //若数据库中不存在此字段，仅该实体类独有，则添加此注解避免该字段添加到sql语句中
    private Integer online;


    //逻辑删除字段，标记当前记录是否被删除，逻辑删除并不会实际删除数据，而是使用update的方式将该字段标记为已删除状态
    @TableLogic(value = "0",delval = "1")  //也可以在yml中编辑全局配置
    private Integer deleted;

    @Version
    private Integer version;

}
