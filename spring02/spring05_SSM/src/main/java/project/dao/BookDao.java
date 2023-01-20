package project.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import project.domain.Book;

import java.util.List;

@Repository
public interface BookDao {

//    @Insert("insert into tb_look values(null,#{type},#{name},#{description})")    //#{type}此等格式表示拿取Book中的属性
    @Insert("insert into tb_look (type,name,description) values(#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update tb_look set type=#{type},name=#{name},description=#{description} where id=#{id}")
    public int update(Book book);

    @Delete("delete from tb_look where id=#{id}")
    public int delete(Integer id);

    @Select("select * from tb_look where id=#{id}")
    public Book getById(Integer id);

    @Select("select * from tb_look")
    public List<Book> getAll();
}
