package day1.springbootweb2.Contorller;

import day1.springbootweb2.pojo.Emp;
import day1.springbootweb2.pojo.Result;
import day1.springbootweb2.service.EmpService;
import day1.springbootweb2.service.impl.EmpServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class EmpController {
    private final EmpService empService;
    public EmpController(EmpService empService) {
        this.empService = empService;
    }
    @RequestMapping("/listEmp")
    public Result list(){
    List<Emp> emps = empService.listEmp();
    return Result.success(emps);
}
}
