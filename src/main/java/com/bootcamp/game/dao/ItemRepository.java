package com.bootcamp.game.dao;

import com.bootcamp.game.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
