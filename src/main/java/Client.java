import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.webservice.IBankAccountService;
import com.example.webservice.UserDetails;


public class Client {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
		IBankAccountService service= (IBankAccountService) ctx.getBean("bankServiceTestClient");
		
		UserDetails user= new UserDetails();
		user.setName("Ajmal");
		user.setBankBalance(new BigDecimal(19000));
		
		service.addUserDetails(user);
		
		UserDetails user2= service.getUserDetails("Ajmal");

		System.out.println(user2.getBankBalance());
	}

}
