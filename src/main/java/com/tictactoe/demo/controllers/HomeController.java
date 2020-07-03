package com.tictactoe.demo.controllers;

import com.tictactoe.demo.entities.Board;
import com.tictactoe.demo.entities.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        Player p1 = new Player('X',"Spartan");
        Player p2 = new Player('O',"Gladiator");
        Board b = new Board();
        model.addAttribute("player1",p1);
        model.addAttribute("player2",p2);
        model.addAttribute("board",b);
        return "index";
    }
}
