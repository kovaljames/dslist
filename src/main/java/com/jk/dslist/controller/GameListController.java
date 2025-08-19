package com.jk.dslist.controller;

import com.jk.dslist.dto.GameListDTO;
import com.jk.dslist.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        return gameListService.getById(id);
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.getAll();
    }
}
