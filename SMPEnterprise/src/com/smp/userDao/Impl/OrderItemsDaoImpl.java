package com.smp.userDao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.smp.admindao.impl.ProductDaoImpl;
import com.smp.bean.Order_items;
import com.smp.bean.Product;
import com.smp.query.OrderItemsQuery;
import com.smp.user.dao.OrderItemsDao;
import com.smp.utility.ConnectionManager;

public class OrderItemsDaoImpl implements  OrderItemsDao {
//	private static final int Product_id = 0;
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	ProductDaoImpl ad=new ProductDaoImpl();
//	static List<Product> temp=new ArrayList<Product>();
	

	@Override
	public void Addtocart() {
		List<Product> viewProducts=		ad.viewallProducts();
		try {
			con=ConnectionManager.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Product pd : viewProducts)
		{
			System.out.println(pd.getProduct_id()+"\t"+pd.getName()+"\t"+pd.getPrice()+"\t"+pd.getQuantity());
		

		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Which product u want to buy");
		int pid=sc.nextInt();
		System.out.println("Enter the quantity");
		int qty1=sc.nextInt();
		
		for(Product pd : viewProducts)
		{
if(pd.getProduct_id()==pid)
{
	try {
		ps=con.prepareStatement(OrderItemsQuery.INSERT_QUERY);
		ps.setInt(1,pd.getProduct_id());
		ps.setString(2, pd.getName());
		
		ps.setInt(3, pd.getPrice());
		ps.setInt(4, qty1);

	int count=	ps.executeUpdate();
	if(count!=0)
System.out.println("Added to cart succcessfully");
	else
		System.out.println("Not added");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
		}
		
		
//	ad.viewallProducts();
        // Product pb=null;
	//	return Product_id;
	
	
	
	
		
		
		
		
	}

	@Override
	public void viewCart(int order_items_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int update(int order_items_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletefromcart(int order_items_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
