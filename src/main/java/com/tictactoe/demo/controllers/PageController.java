package com.tictactoe.demo.controllers;

import com.tictactoe.demo.entities.Content;
import com.tictactoe.demo.repository.PlayerRepository;
import com.tictactoe.demo.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController extends ContentService {
    @Autowired
    private EditorController editor;
    static Content content;
    @GetMapping("/publications")
    public String page(Model model){
        content= findContentByUnicTitle(editor.content.getUnicTitle());
        System.out.println(content);
        model.addAttribute("content",content);
        return "publications";
    }
}
