package com.example.springbootmybaties;

import mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMybatiesApplicationTests {

//    @Test
//    void contextLoads() {
//    }
@Autowired
private EmpMapper empMapper;
    @Test
    public void testempMapper(){
        empMapper.delete(17);
    }
}
