package com.bill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bill.manager.BillManager;
import com.commons.entity.Order;

@RestController
@RequestMapping(value = { "/bill" })

public class BillController {
	
	@Autowired
	BillManager billmanager;

	@PostMapping(value = "/getbill", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getBill(@RequestBody Order order) {		
		return ResponseEntity.status(HttpStatus.OK).body(billmanager.getInfoBill(order));		
	}
	
}
