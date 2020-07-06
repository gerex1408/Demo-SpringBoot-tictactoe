package com.tictactoe.demo.controllers;

import com.tictactoe.demo.entities.Board;
import com.tictactoe.demo.entities.Player;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/")
    @ResponseBody
    public String modificar_taulell(@RequestParam(defaultValue = "0") int pos1,@RequestParam(defaultValue = "0") int pos2){
        char symbol;
        int col,fil;
        if(pos1==0){
            symbol='O';
            col = (pos2-1)%b.getSize();
            fil= (pos2-1)/b.getSize();
        }
        else{
            symbol='X';
            col = (pos1-1)%b.getSize();
            fil= (pos1-1)/b.getSize();
        }
        b.getTaulell()[fil][col]= symbol;
        return "index";
    }

}
