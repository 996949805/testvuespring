package com.lao.vuespring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.lao.vuespring.mapper")
@SpringBootApplication
public class VuespringApplication {

	public static void main(String[] args) {
		SpringApplication.run(VuespringApplication.class, args);
	}

}
