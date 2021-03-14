package com.javacuckoo.springsecurityjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.javacuckoo.springsecurityjpa.repository")
@SpringBootApplication
public class SpringSecurityJpaApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaApplication.class, args);
	}
	
	
//	@Autowired
//	private  UserRepository userRepository;	
//	
//	@PostConstruct
//	public void test() {
//		userRepository.save(new User("user", "pass", true, "ROLE_USER"));
//		userRepository.save(new User("admin", "pass", true, "ROLE_USER,ROLE_ADMIN"));
//
//	}

}
