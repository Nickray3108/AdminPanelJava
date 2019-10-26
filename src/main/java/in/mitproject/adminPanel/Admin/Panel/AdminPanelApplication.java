package in.mitproject.adminPanel.Admin.Panel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminPanelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminPanelApplication.class, args);
		hello();
	}

	public static void hello(){
		System.out.println("Hello Nikhil");
	}

}
