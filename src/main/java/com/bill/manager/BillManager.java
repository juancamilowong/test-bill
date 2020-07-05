package com.bill.manager;

import org.springframework.stereotype.Component;

import com.commons.entity.BillInfo;
import com.commons.entity.Order;
import com.commons.entity.Product;

@Component
public class BillManager {
	
	public BillInfo getInfoBill(Order order) {
		
		BillInfo billInfo = new BillInfo();
		double sumProducts = 0;
		for (Product product : order.getProducts()) {
			
			sumProducts += (product.getCost() * product.getQuantity());
		}
		
		billInfo.setTotal(sumProducts);
		billInfo.setTax(sumProducts * BillInfo.TAX_VALUE);
		billInfo.setGrandTotal(billInfo.getTotal() + billInfo.getTax());
		
		return billInfo;
		
	}

}
