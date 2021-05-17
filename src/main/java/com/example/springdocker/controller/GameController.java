package com.example.springdocker.controller;

import com.example.springdocker.model.Game;
import com.example.springdocker.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class GameController {
    private final GameService service;

    @GetMapping("/games")
    public List<Game> getGames() {
        return service.getGames();
    }

    @PostMapping("/games")
    public void saveNewFood(@RequestBody Game game) {
        service.saveNewGame(game);
    }

    @GetMapping("/games/playable")
    public List<String> getCookableoods() {
        return service.getPlayableGames();
    }
}
