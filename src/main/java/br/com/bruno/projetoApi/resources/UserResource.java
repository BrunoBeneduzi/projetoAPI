package br.com.bruno.projetoApi.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bruno.projetoApi.domain.User;
import br.com.bruno.projetoApi.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity< List<User>> findAll(){
		User maria = new User("1", "Maria", "maria@gmail.com");
		User alex = new User("2", "Alexx", "alex@gmail.com");
		List<User> list = service.findAll();
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}
	 
}