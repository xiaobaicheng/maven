package mapper.springbootmybits;

import mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMybitsApplicationTests {
//
//    @Test
//    void contextLoads() {
//    }
    @Autowired
    private EmpMapper empMapper;
    @Test
    public void testEmpMapper(){
        empMapper.delete(17);
    }

}
