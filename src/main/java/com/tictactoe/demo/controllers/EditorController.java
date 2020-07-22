package com.tictactoe.demo.controllers;
import com.tictactoe.demo.entities.Content;
import com.tictactoe.demo.service.ContentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EditorController extends ContentService {
    Content content;
    @GetMapping("/edition")
    public String editor(){
        return "editor";
    }
    @PostMapping("/edition")
    public String edit(@RequestBody Content c){
        saveContent(c);
        content=c;
        return "redirect:/edition";
    }
}
