package br.com.bruno.projetoApi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import br.com.bruno.projetoApi.domain.User;
import br.com.bruno.projetoApi.repository.UserRepository;

@SpringBootApplication
@Configuration
public class ProjetoApiApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null,"maria silva","maria@gmail.com");
		User alex = new User(null,"alex","alex@gmail.com");
		User bob = new User(null,"bob","bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria,alex,bob));
	}
}