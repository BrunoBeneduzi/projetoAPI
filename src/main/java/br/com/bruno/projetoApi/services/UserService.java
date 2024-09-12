package br.com.bruno.projetoApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bruno.projetoApi.domain.User;
import br.com.bruno.projetoApi.repository.UserRepository;

@Service
public class UserService {
	 
	@Autowired
	private UserRepository rep;
	
	public List<User> findAll(){
		return rep.findAll();
	}
}