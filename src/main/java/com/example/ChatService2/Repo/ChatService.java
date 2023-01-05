package com.example.ChatService2.Repo;

import java.util.List;
import java.util.Optional;

import com.example.ChatService2.Model.Chat;

public interface ChatService {
Chat createChat(Chat chat);
List<Chat> getAllChat(Chat chat);
public Optional<Chat> getChatById(int chatid);
}
