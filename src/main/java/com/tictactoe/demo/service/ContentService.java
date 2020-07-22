package com.tictactoe.demo.service;

import com.tictactoe.demo.entities.Content;

import com.tictactoe.demo.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService{
    @Autowired
    private ContentRepository contentRepository;

    public Content saveContent(Content content){
        return contentRepository.save(content);
    }
    public ContentService(){}
    public Content findContentById(int id){
        return contentRepository.findById(id);
    }
    public Content findContentByUnicTitle(String unicTitle){ return  contentRepository.findByUnicTitle(unicTitle);}
}
