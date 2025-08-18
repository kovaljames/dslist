package com.jk.dslist.controller;

import com.jk.dslist.dto.GameMinDTO;
import com.jk.dslist.entity.Game;
import com.jk.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        //List<Game> result = gameService.findAll();
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
