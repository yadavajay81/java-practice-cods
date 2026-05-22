package com.example.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventory.model.Item;
import com.example.inventory.model.ItemStatus;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	List<Item> findByItemStatusAndItemEnteredByUser(ItemStatus status, String enteredByUser );

}
