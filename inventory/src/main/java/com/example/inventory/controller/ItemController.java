package com.example.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory.model.Item;
import com.example.inventory.model.ItemStatus;
import com.example.inventory.service.ItemService;

@RestController
@RequestMapping("/api/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@PostMapping
	public ResponseEntity<?> addItem(@RequestBody Item item){
		
		try {
			Item saved = itemService.addItem(item);
			return ResponseEntity.status(201).body(saved);
			
		}catch(IllegalArgumentException e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
	}
	
	@PutMapping("/{itemId}")
	public ResponseEntity<?> updateItem(@PathVariable Integer itemId, @RequestBody Item item){
		try {
			return ResponseEntity.ok(itemService.updateItem(itemId, item));
			
		}catch(Exception e) {
			return ResponseEntity.status(404).body("Item not found!");
		}
		
		
	}
	
	@DeleteMapping("/{itemId}")
	public ResponseEntity<?> deleteById(@PathVariable Integer itemId){
		try {
			itemService.deleteItem(itemId);
			return ResponseEntity.ok().build();
			
		}catch(IllegalArgumentException e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteAllItem(){
		try {
			itemService.deleteAllItem();
			return ResponseEntity.ok().build();
		}catch(IllegalArgumentException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/{itemId}")
	public ResponseEntity<?> getItem(@PathVariable Integer itemId){
		try {
			return ResponseEntity.ok(itemService.getItem(itemId));
			
		}catch(Exception e) {
			return ResponseEntity.status(404).body("Item not found!");
		}
	}
	
	@GetMapping
	public ResponseEntity<?> getAllItems(
			@RequestParam(required = false) ItemStatus itemStatus,
			@RequestParam(required = false) String itemEnteredByUser,
			@RequestParam(required = false) Integer pageSize,
			@RequestParam(required = false) Integer page,
			@RequestParam(required = false) String sortBy){
		
		if(itemStatus != null && itemEnteredByUser != null) {
			return ResponseEntity.ok(itemService.findByStatusAndUser(itemStatus, itemEnteredByUser));
		}else if(pageSize != null && page != null && sortBy != null) {
			return ResponseEntity.ok(itemService.getPaginated(page, pageSize, sortBy));
		}else {
		
		
		return ResponseEntity.ok(itemService.getAll());
		}
		
	}
	
	

}
