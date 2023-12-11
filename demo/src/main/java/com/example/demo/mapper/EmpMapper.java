package com.example.demo.mapper;

import com.example.demo.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface EmpMapper {
    @Delete("delete  from mybatis.emp where id=#{id}")
    public void delete(Integer id);
//    新增
    @Insert("insert into mybatis.emp( username,  name, gender, image, job, entrydate, dept_id, create_time, update_time)"+
    "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})" )
    public void insert(Emp emp);

//    根据ID查询信息
    @Select("select * from mybatis.emp where id  = #{id}")
    public Emp getById(Integer id);

//    根据条件查询
//    @Select("select * from mybatis.emp where name like concat('%',#{name}, '%') and gender = #{gender} and " +
//            "entrydate between #{start} and #{end} order by update_time desc")
    public List<Emp> list(String name, Short gender, LocalDate start, LocalDate end);
//    修改
//    @Update("update mybatis.emp set name=#{name},gender= #{gender},image = #{image},job=#{job}," +
//            " entrydate = #{entrydate}, dept_id= #{deptID},update_time = #{updateTime} where id = #{id} ")
    public void updateA(Emp emp);
//    批量删除
    public void deletebyIds(List<Integer> ids);
 }
