package com.tictactoe.demo.controllers;

import com.tictactoe.demo.entities.Board;
import com.tictactoe.demo.entities.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    static boolean turn=true;
    static int repeating1 = 0;
    static int repeating2 = 0;
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
    public String modificar_taulell(@RequestParam(defaultValue = "0") int pos1, @RequestParam(defaultValue = "0") int pos2,RedirectAttributes redirectAttributes){
        char symbol;
        int pos;
        String player_playing;
        int col,fil;
        if(pos1==0){
            repeating2++;
            repeating1=0;
            symbol=p2.getSymbol();
            col = (pos2-1)%b.getSize();
            fil= (pos2-1)/b.getSize();
            pos=pos2;
            player_playing=p2.getUser_name();
        }
        else{
            repeating1++;
            repeating2=0;
            symbol=p1.getSymbol();
            col = (pos1-1)%b.getSize();
            fil= (pos1-1)/b.getSize();
            pos=pos1;
            player_playing=p1.getUser_name();
        }
        redirectAttributes.addFlashAttribute("message", "Not your turn "+player_playing+ " !");
        redirectAttributes.addFlashAttribute("alertClass", "alert-danger");
        if(repeating2>=2 || repeating1>=2){
            turn=false;
        }
        if(turn==false){
            turn=true;
            return "redirect:/";
        }
        redirectAttributes.addFlashAttribute("message", "Good, "+player_playing+ " placed on position "+ pos +" !");
        redirectAttributes.addFlashAttribute("alertClass", "alert-success");
        b.getTaulell()[fil][col]= symbol;
        return "redirect:/";
    }


}
