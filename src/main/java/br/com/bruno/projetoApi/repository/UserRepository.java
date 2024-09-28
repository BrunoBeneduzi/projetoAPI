package br.com.bruno.projetoApi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.bruno.projetoApi.domain.User;

//essa classe contem os metodos para trabalhar com o mongoDB, para enviar os dados ou retornar
@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
	
}

/*Ao estender MongoRepository, você ganha acesso a vários métodos CRUD padrão, sem precisar implementá-los explicitamente.

save(S entity): Salva ou atualiza um documento.
findById(ID id): Busca um documento pelo seu ID.
findAll(): Recupera todos os documentos da coleção.
deleteById(ID id): Remove um documento pelo ID.
count(): Conta o número total de documentos na coleção.*/