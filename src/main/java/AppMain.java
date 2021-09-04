import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.honsoft.springorm.entity.EmployeeEntity;
import com.honsoft.springorm.service.EmployeeManager;
import com.honsoft.springorm.service.EmployeeManagerImpl;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		
		EmployeeManager employeeManager = context.getBean("employeeManager",EmployeeManager.class);
		
		EmployeeEntity en = new EmployeeEntity();
		en.setFirstname("TEST");
		
		//employeeManager.addEmployee(en);
		
		List<EmployeeEntity> list = employeeManager.getAllEmployees();
		for(EmployeeEntity entity : list) {
			System.out.println(entity.getId()+" , "+entity.getFirstname()+" , "+entity.getEmail());
		}
	}
}
