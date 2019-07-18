import com.imooc.oa.biz.EmployeeBiz;
import com.imooc.oa.biz.impl.EmployeeBizImpl;
import com.imooc.oa.entity.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class myT {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-service.xml");
        EmployeeBiz employeeBiz= (EmployeeBiz) context.getBean("employeeBiz");
        List<Employee> employeeBizAll = employeeBiz.getAll();
        System.out.println(employeeBizAll);
    }
}
