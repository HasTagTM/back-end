import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.GodfathersPizza.ordini.OrderConfiguration;

public class MenuRunner implements CommandLineRunner{

	Logger log = LoggerFactory.getLogger(MenuRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		
	}

	public void configBean() {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(OrderConfiguration.class);
		
		
	}
	
}
