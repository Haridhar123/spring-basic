package com.example.ChatService2.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ChatService2.Model.Chat;

public interface ChatRepo extends JpaRepository<Chat,Integer>{

}
