package com.ll.exam.app__2022_10_04;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App20221004Application {

	public static void main(String[] args) {
		SpringApplication.run(App20221004Application.class, args);
	}

	@Bean
	// ObjectMapper란 JSON 형식을 사용할 때, 응답들을 직렬화하고 요청들을 역직렬화 할 때 사용하는 기술이다.
	// 역질렬화란 데이터가 모두 전송된 이후, 수신측에서 다시 문자열을 기존의 객체로 회복시켜주는 것.
	// String 문자열 -> Object
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}