package com.smp.user.dao;

import com.smp.bean.Order_items;
import com.smp.bean.Product;

public interface OrderItemsDao {
public  void  Addtocart();
	void viewCart(int order_items_id);
	int update (int order_items_id);
	int deletefromcart(int order_items_id);  
	
	
	

}
