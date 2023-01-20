package project.dao;

import org.apache.ibatis.annotations.Insert;

public interface LogDao {

    @Insert("insert into tb_log (info,createDate) values(#{info},now())")
    public void log(String info);

}
