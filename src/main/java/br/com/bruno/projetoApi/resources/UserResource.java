package br.com.bruno.projetoApi.resources;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bruno.projetoApi.domain.User;
import br.com.bruno.projetoApi.services.UserService;
import br.com.bruno.projetoApi.userDTO.UserDTO;

//a palavra resourse serve para identifcar classes\pacotes do rest
@RestController

@RequestMapping(value="/users")
public class UserResource {
	
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity< List<UserDTO>> findAll(){
		
		List<User> list = service.findAll();
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
				
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value ="/{id}", method=RequestMethod.GET)
	public ResponseEntity<UserDTO> findById(@PathVariable String id){
		User obj = service.findById(id);
		
		return ResponseEntity.ok().body(new UserDTO(obj));
	}
	 
	 
}