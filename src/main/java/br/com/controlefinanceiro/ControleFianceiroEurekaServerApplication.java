package br.com.controlefinanceiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ControleFianceiroEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleFianceiroEurekaServerApplication.class, args);
	}

}
