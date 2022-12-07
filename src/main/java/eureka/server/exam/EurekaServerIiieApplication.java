package eureka.server.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerIiieApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerIiieApplication.class, args);
	}

}
