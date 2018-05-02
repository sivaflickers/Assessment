package com.att.digicustomer.action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.att.digicustomer.Product;
import com.att.digicustomer.ProductDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{
	
	private String productId;
	private String productName;
	private String productDescription;
	private String relatedProducts;
	private String quantity;
	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	private String[] deleteArray;
	private HashMap<String,Object> productManagerHM;
	private List<Product> productDetailsForUpdateList;
	
	public String addProductRedirect(){
		return SUCCESS;
	}
	
	public String addProduct(){
		
		
		Product product = new Product();
		product.setProductId(productId);
		product.setProductName(productName);
		product.setProductDescription(productDescription);
		product.setRelatedProducts(relatedProducts);
		product.setQuantity(quantity);
		
		ProductDAO productDAO = new ProductDAO();
		productDAO.addProductToDB(product);
				
		return SUCCESS;
	}
	
	
	public String deleteProduct(){
		
        
		
		try {
			
			ProductDAO productManagerDAO = new ProductDAO();
			productManagerDAO.deleteProductsInDB(deleteArray);
			productManagerHM = (HashMap<String, Object>)productManagerDAO.retrieveProducts();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return SUCCESS;
	}

    public String homePage(){
		
			
		
		try {
			ProductDAO productManagerDAO = new ProductDAO();
			productManagerHM = (HashMap<String, Object>)productManagerDAO.retrieveProducts();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
    
    public String updateProduct(){
    	
    	
		try {
			ProductDAO productDAO = new ProductDAO();
			productDetailsForUpdateList = (ArrayList<Product>)productDAO.retrieveProductsForUpdate(productId);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return SUCCESS;
    }
    
	public String updateProductInDB(){
	
		
		Product product = new Product();
		product.setProductId(productId);
		product.setProductName(productName);
		product.setProductDescription(productDescription);
		product.setRelatedProducts(relatedProducts);
		
		ProductDAO productDAO = new ProductDAO();
		productDAO.updateProductInDB(product);
				
		return SUCCESS;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getRelatedProducts() {
		return relatedProducts;
	}

	public void setRelatedProducts(String relatedProducts) {
		this.relatedProducts = relatedProducts;
	}

	public HashMap<String, Object> getProductManagerHM() {
		return productManagerHM;
	}

	public void setProductManagerHM(HashMap<String, Object> productManagerHM) {
		this.productManagerHM = productManagerHM;
	}

	public String[] getDeleteArray() {
		return deleteArray;
	}

	public void setDeleteArray(String[] deleteArray) {
		this.deleteArray = deleteArray;
	}

	public List<Product> getProductDetailsForUpdateList() {
		return productDetailsForUpdateList;
	}

	public void setProductDetailsForUpdateList(
			List<Product> productDetailsForUpdateList) {
		this.productDetailsForUpdateList = productDetailsForUpdateList;
	}

}
