package com.tictactoe.demo.controllers;


import com.tictactoe.demo.entities.Player;
import com.tictactoe.demo.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegisterController extends PlayerService{
    static String username1;
    static String username2;
    static Player p1=new Player('X',username1);
    static Player p2=new Player('O',username2);
    @GetMapping("/")
    public String getRegister(Model model){
        return "register";
    }

    @PostMapping ("/")
    public String register(@RequestParam String username1, @RequestParam String username2, RedirectAttributes redirectAttributes){
        if(!username1.equals("")&&!username2.equals("")){
            redirectAttributes.addFlashAttribute("username1",username1);
            redirectAttributes.addFlashAttribute("username2", username2);
            p1.setUser_name(username1);
            p2.setUser_name(username2);
            savePlayer(p1);
            savePlayer(p2);
            return "redirect:/game";
        }
        if(username1.equals("")||username2.equals(""))redirectAttributes.addFlashAttribute("message","Please both enter a username");
        return "redirect:/";
    }
    public Player getP1(){
        return p1;
    }
    public Player getP2(){
        return p2;
    }
}
