package com.jaum1981.dslist.services;

import com.jaum1981.dslist.dto.GameDTO;
import com.jaum1981.dslist.entities.Game;
import com.jaum1981.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameDTO> dto = result.stream().map(x -> new GameDTO(x)).toList();
        return dto;
    }

}
