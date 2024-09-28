package br.com.bruno.projetoApi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bruno.projetoApi.domain.User;
import br.com.bruno.projetoApi.repository.UserRepository;
import br.com.bruno.projetoApi.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	 
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		 Optional<User> user = repo.findById(id); // Optional para evitar NullPointerException
		 return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}