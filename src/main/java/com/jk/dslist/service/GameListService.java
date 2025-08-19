package com.jk.dslist.service;

import com.jk.dslist.dto.GameListDTO;
import com.jk.dslist.entity.GameList;
import com.jk.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public GameListDTO getById(Long id) {
        GameList result = gameListRepository.findById(id).get();
        return new GameListDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameListDTO> getAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
