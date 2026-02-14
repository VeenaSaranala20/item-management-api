package com.example.itemapi.service;

import com.example.itemapi.model.Item;
import com.example.itemapi.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository repo;

    public ItemService(ItemRepository repo) {
        this.repo = repo;
    }

    public Item addItem(Item item) {
        return repo.save(item);
    }

    public Item getItem(Long id) {
        return repo.findById(id);
    }
}
