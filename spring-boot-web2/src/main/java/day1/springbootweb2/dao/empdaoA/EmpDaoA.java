package day1.springbootweb2.dao.empdaoA;

import day1.springbootweb2.dao.EmpDao;
import day1.springbootweb2.pojo.Emp;
import day1.springbootweb2.utils.XmlParserUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component
@Repository//  衍生注解  专门注解dao层
public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
//        获取数据
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        List<Emp> emplist = XmlParserUtils.parse(file, Emp.class);
        return emplist;
    }
}
