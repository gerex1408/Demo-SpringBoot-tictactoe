package com.tictactoe.demo.repository;

import com.tictactoe.demo.entities.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {
    Content findById(int id);
    Content findByUnicTitle(String unicTitle);
}
