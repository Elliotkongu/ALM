package com.example.springdocker.repository;

import com.example.springdocker.model.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GameRepository extends MongoRepository<Game, String> {
    List<Game> findGameByCanIPlayIt(boolean canIPlayIt);
}
