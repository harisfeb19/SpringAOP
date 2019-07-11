package Testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s8 = factory.getBean(Samsung.class);
		s8.config();

	}

}
