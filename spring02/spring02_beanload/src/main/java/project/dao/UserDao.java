package project.dao;

import org.apache.ibatis.annotations.Insert;
import project.domain.User;

public interface UserDao {

    @Insert("insert into tb_user(username,password)values(#{username},#{password})")
    public void save(User user);

}
