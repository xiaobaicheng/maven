package com.example.demo;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private EmpMapper empMapper;
    @Test
    void tesrempMapper() {
        empMapper.delete(17);
    }
//增加
    @Test
    void testInsert(){
        Emp emp = new Emp();
        emp.setUsername("Tom");
        emp.setName("汤姆");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);
    }

//    根据Id查询
    @Test
    void testGetbyid(){
        Emp emp = empMapper.getById(15);
        System.out.println(emp);
    }
//    根据条件查询
    @Test
    void testList(){
        List<Emp> listemp = empMapper.list("张", (short) 1, LocalDate.of(2001, 1, 1), LocalDate.of(2022, 10, 10));
        System.out.println(listemp);
    }
//    动态更新员工数据
    @Test
    void testupdate(){
        Emp emp = new Emp();
        emp.setId(18);
        emp.setUsername("Tom22");
        emp.setName("汤姆22");
        emp.setGender((short) 1);
//        emp.setDeptId(1);
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.updateA(emp);
    }
//    批量删除
    @Test
    void testupdatebuids(){
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        empMapper.deletebyIds(arrayList);
    }
}
