package com.att.digicustomer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.att.digicustomer.Product;

public class ProductDAO {

	public static HashMap<String, Product> productDAOHM = new HashMap<String, Product>();
	
	public void addProductToDB(Product product){
		
		try{
			
			productDAOHM.put(product.getProductId(), product);
			
			System.out.println(productDAOHM.size());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public Object retrieveProducts(){
		
		return productDAOHM;
		
	}
	
	public void deleteProductsInDB(String[] deletedProductIdArr){
		
		Set<String> productIdSet;
		
		try{
			
			productIdSet = new HashSet<String>(Arrays.asList(deletedProductIdArr));
			productDAOHM.keySet().removeAll(productIdSet);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Object retrieveProductsForUpdate(String productId){
		
		List<Product> productDetailsForUpdateList = new ArrayList<Product>();
		
		try{
			productDetailsForUpdateList.add(productDAOHM.get(productId));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return productDetailsForUpdateList;
		
	}
	
	public void updateProductInDB(Product product){
		
		try{
			
			productDAOHM.put(product.getProductId(), product);
			
			System.out.println(productDAOHM.size());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
