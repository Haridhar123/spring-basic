package com.example.ChatService2.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChatService2.Model.Chat;
import com.example.ChatService2.Repo.ChatService;

@RestController
@RequestMapping("/ask")
public class ChatController {

	
	@Autowired
	private ChatService service;
	@PostMapping("/")
	public String createChat(@RequestBody Chat chat)
	{
		Chat r=service.createChat(chat);
		return "ji";
	}
	@GetMapping("/findall")
	public List<Chat> getAllChats(Chat chat)
	{
		return service.getAllChat(chat);
				
	}
	@GetMapping("/find/{chatid}")
	public Optional<Chat> getChat(@PathVariable int chatid)
	{
		return service.getChatById(chatid);
	}
}
