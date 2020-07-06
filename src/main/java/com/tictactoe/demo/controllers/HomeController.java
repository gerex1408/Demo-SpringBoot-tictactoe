package com.tictactoe.demo.controllers;

import com.tictactoe.demo.entities.Board;
import com.tictactoe.demo.entities.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    static Board b =new Board();
    static Player p1 = new Player('X',"Spartan");
    static Player p2 = new Player('O',"Gladiator");
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("player1",p1);
        model.addAttribute("player2",p2);
        model.addAttribute("board",b);
        return "index";
    }
    @PutMapping("/")
    public String  modificar_taulell(@RequestParam int pos, @RequestParam char symbol){
        int col = (pos-1)%b.getSize();
        int fil= (pos-1)/b.getSize();
        b.getTaulell()[fil][col]=symbol;
        return "index";
    }

}
