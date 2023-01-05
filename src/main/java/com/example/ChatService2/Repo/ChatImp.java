package com.example.ChatService2.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ChatService2.Model.Chat;

@Service
public class ChatImp implements ChatService {
@Autowired
private ChatRepo repo;
	@Override
	public Chat createChat(Chat chat) {
		// TODO Auto-generated method stub
		Chat r=repo.save(chat);
		return r;
	}

	@Override
	public List<Chat> getAllChat(Chat chat) {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Chat> getChatById(int chatid) {
		// TODO Auto-generated method stub
		return repo.findById(chatid);
	}

	
}
