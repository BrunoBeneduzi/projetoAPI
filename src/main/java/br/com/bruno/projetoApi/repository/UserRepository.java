package br.com.bruno.projetoApi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.bruno.projetoApi.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}