package com.example.inventory.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;

    private String itemName;
    private String itemEnteredByUser;
    private LocalDateTime itemEnteredDate = LocalDateTime.now();

    private Double itemBuyingPrice;
    private Double itemSellingPrice;

    private LocalDateTime itemLastModifiedDate = LocalDateTime.now();
    private String itemLastModifiedByUser;

    @Enumerated(EnumType.STRING)
    private ItemStatus itemStatus = ItemStatus.AVAILABLE;
    
 // Getters and setters

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemEnteredByUser() {
		return itemEnteredByUser;
	}

	public void setItemEnteredByUser(String itemEnteredByUser) {
		this.itemEnteredByUser = itemEnteredByUser;
	}

	public LocalDateTime getItemEnteredDate() {
		return itemEnteredDate;
	}

	public void setItemEnteredDate(LocalDateTime itemEnteredDate) {
		this.itemEnteredDate = itemEnteredDate;
	}

	public Double getItemBuyingPrice() {
		return itemBuyingPrice;
	}

	public void setItemBuyingPrice(Double itemBuyingPrice) {
		this.itemBuyingPrice = itemBuyingPrice;
	}

	public Double getItemSellingPrice() {
		return itemSellingPrice;
	}

	public void setItemSellingPrice(Double itemSellingPrice) {
		this.itemSellingPrice = itemSellingPrice;
	}

	public LocalDateTime getItemLastModifiedDate() {
		return itemLastModifiedDate;
	}

	public void setItemLastModifiedDate(LocalDateTime itemLastModifiedDate) {
		this.itemLastModifiedDate = itemLastModifiedDate;
	}

	public String getItemLastModifiedByUser() {
		return itemLastModifiedByUser;
	}

	public void setItemLastModifiedByUser(String itemLastModifiedByUser) {
		this.itemLastModifiedByUser = itemLastModifiedByUser;
	}

	public ItemStatus getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(ItemStatus itemStatus) {
		this.itemStatus = itemStatus;
	}

    
    
    
}