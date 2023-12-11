package day1.springbootweb2.service.impl;
import day1.springbootweb2.dao.EmpDao;
import day1.springbootweb2.dao.empdaoA.EmpDaoA;
import day1.springbootweb2.pojo.Emp;
import day1.springbootweb2.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service//衍生注解  专门注解 srvice成
public class EmpServiceA implements EmpService {
    private final EmpDao empDao;

    public EmpServiceA(EmpDao empDao) {
        this.empDao = empDao;
    }

    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.listEmp();
        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if ("1".equals(gender)){
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }
            String job = emp.getJob();
            if ("1".equals(job)){
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
