package mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface EmpMapper {
    @Delete("delete from mybatis.emp where id=#{id}")
    public void delete(Integer id);
}
