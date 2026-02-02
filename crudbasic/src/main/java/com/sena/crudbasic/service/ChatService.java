package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.ChatDto;
import com.sena.crudbasic.model.Chat;

public interface ChatService {

    /*
     * findAll
     * findById
     * filterByName
     * save
     * delete
     */
    public List<Chat> findAll();
    public Chat findById(int id);
    public List<Chat> filterByName(String name);
    public String save(ChatDto c);
    public String delete(int id);
}
