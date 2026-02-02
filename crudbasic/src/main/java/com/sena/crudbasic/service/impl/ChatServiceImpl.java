package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.ChatDto;
import com.sena.crudbasic.model.Chat;
import com.sena.crudbasic.repository.ChatRepository;
import com.sena.crudbasic.service.ChatService;

@Service
public class ChatServiceImpl
implements ChatService {

    @Autowired
    private ChatRepository repo;

    /*
    public ChatServiceImpl(ChatRepository repo) {
        this.repo = repo;
    }
    */

    @Override
    public List<Chat> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Chat findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Chat> filterByName(String name) {
        return repo.filterByName(name);
    }

    // conversor del DTO al model
    public Chat dtoToModel(ChatDto chatDto) {
        Chat chat = new Chat();
        chat.setId(chatDto.getId());
        chat.setName(chatDto.getName());
        chat.setRecord(null);
        return chat;
    }

    public ChatDto modelToDto(Chat chat) {
        return new ChatDto(
                chat.getId(),
                chat.getName()
        );
    }

    @Override
    public String save(ChatDto chatDto) {
        Chat chat = dtoToModel(chatDto);
        repo.save(chat);
        return null;
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return null;
    }

}
