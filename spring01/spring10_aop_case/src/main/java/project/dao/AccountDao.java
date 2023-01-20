package project.dao;

import org.apache.ibatis.annotations.Select;
import project.domain.Account;

import java.util.List;


public interface AccountDao {

    @Select("select * from tb_user ")
    List<Account> findAll();

    @Select("select * from tb_user where id = #{id}")
    Account findById(Integer id);

}
