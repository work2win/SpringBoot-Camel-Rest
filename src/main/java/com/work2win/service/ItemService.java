package com.work2win.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.work2win.model.Item;

import jakarta.annotation.PostConstruct;

@Service
public class ItemService {

	private List<Item> items = new ArrayList<>();
	
	@PostConstruct
	public void totalItemsIntialization() {
		items.add(new Item("coke", 2));
		items.add(new Item("milk", 5));
		items.add(new Item("bread", 2));
		items.add(new Item("orange", 12));
	}
	
	public Item addItem(Item item) {
		items.add(item);
		return item;		
	}
	
	public List<Item> getAllItems(){
		return items;
	}
}
