package com.example.itemapi.repository;

import com.example.itemapi.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepository {

    private List<Item> items = new ArrayList<>();
    private Long nextId = 1L;

    public Item save(Item item) {
        item.setId(nextId++);
        items.add(item);
        return item;
    }

    public Item findById(Long id) {
        return items.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
