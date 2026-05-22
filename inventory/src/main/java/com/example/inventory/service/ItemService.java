package com.example.inventory.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.inventory.model.Item;
import com.example.inventory.model.ItemStatus;
import com.example.inventory.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository repo;
	
	public Item addItem(Item item) {
		if(item.getItemId() != null && repo.existsById(item.getItemId())) {
			throw new IllegalArgumentException("Item already exists");
		}
		item.setItemEnteredDate(LocalDateTime.now());
		item.setItemLastModifiedDate(LocalDateTime.now());
		
		return repo.save(item);
		
	}
	
	public Item updateItem(Integer id, Item updateItem) {
		return repo.findById(id).map(exists -> {
			exists.setItemName(updateItem.getItemName());
			exists.setItemLastModifiedByUser(updateItem.getItemLastModifiedByUser());
			exists.setItemLastModifiedDate(LocalDateTime.now());
			return repo.save(exists);
			
		}).orElseThrow();
	}
	
	public void deleteItem(Integer id) {
		if(!repo.existsById(id)){
			throw new IllegalArgumentException("Item not exist");
		}
		repo.deleteById(id);
	}
	
	public void deleteAllItem() {
		repo.deleteAll();
	}
	
	public Item getItem(Integer itemId) {
		return repo.findById(itemId).orElseThrow();
	}
	
	public List<Item> getAll(){
		return repo.findAll();
	}
	
	public List<Item> findByStatusAndUser(ItemStatus status, String user){
		return repo.findByItemStatusAndItemEnteredByUser(status, user);
		
	}
	
	public Page<Item> getPaginated(int page, int pageSize, String sortBy){
		return repo.findAll(PageRequest.of(page, pageSize, Sort.by(sortBy)));
		
	}

}
