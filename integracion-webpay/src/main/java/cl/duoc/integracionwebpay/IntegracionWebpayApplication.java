package cl.duoc.integracionwebpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IntegracionWebpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegracionWebpayApplication.class, args);
	}

}
