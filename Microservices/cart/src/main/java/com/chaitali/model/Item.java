package com.chaitali.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="item")
public class Item {

	    @Id
	    private String itemId;
	    private String productId;
	    private Integer quantity;  
	    
	    
	    
	    public Item() {
	    	
	    }
	    
	    
		public Item(String itemId, String productId, Integer quantity) {
			super();
			this.itemId = itemId;
			this.productId = productId;
			this.quantity = quantity;
		}


		public String getItemId() {
			return itemId;
		}


		public void setItemId(String itemId) {
			this.itemId = itemId;
		}


		public String getProductId() {
			return productId;
		}


		public void setProductId(String productId) {
			this.productId = productId;
		}


		public Integer getQuantity() {
			return quantity;
		}


		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}


		@Override
		public String toString() {
			return "Item [itemId=" + itemId + ", productId=" + productId + ", quantity=" + quantity + "]";
		}
	    
	    
}
