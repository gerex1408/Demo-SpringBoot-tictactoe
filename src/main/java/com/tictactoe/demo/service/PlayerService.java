package com.tictactoe.demo.service;

import com.tictactoe.demo.entities.Player;
import com.tictactoe.demo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player savePlayer(Player player){
        return playerRepository.save(player);
    }
    public PlayerService(){}
    public Player findPlayerByUsername(String username){
        return playerRepository.findByUsername(username);
    }
}
