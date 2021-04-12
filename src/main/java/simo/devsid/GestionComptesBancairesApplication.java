package simo.devsid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource(locations= {"classpath:spring-beans.xml"}) In case we want to use spring-beans.xml config instead of the MyConfig class
public class GestionComptesBancairesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionComptesBancairesApplication.class, args);
	}

}
