package com.work2win.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work2win.model.Item;

@RestController
@RequestMapping("/")
public class ItemController {
	
	@GetMapping("/items")
	public Item getDetails() {
		
		Item item = new Item("DoveShampoo01", 20);
		return item;
				
	}

}
