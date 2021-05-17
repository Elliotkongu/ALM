package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.Game;
import com.example.springdocker.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GameService {
    private final GameRepository repository;

    public List<Game> getGames() {
        return repository.findAll();
    }

    public void saveNewGame(Game game) {
        repository.save(game);
    }

    public List<String> getPlayableGames() {
        // hämtar alla Games som vi kan spela
        List<Game> playableGames = repository.findGameByCanIPlayIt(true);

        // returnerar endast Game namnen i en lista
        return playableGames.stream()
                .map(Game::getName)
                .collect(Collectors.toList());
    }
}
