package br.com.wallacy.gamestore.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.wallacy.gamestore.Model.Game;

public interface GameRepository extends CrudRepository<Game,Integer>{
    
}
