package com.cn.cntrabalho1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CnTrabalho1Application {

	public static void main(String[] args) {
		SpringApplication.run(CnTrabalho1Application.class, args);
	}

}
