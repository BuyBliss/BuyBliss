package com.commerce.ecommerce.model.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	private String productName;
	private String description;
	private String category;
	private String subCategory;
	private double price;
	private int stock;
	@ManyToOne
	@JoinColumn(name = "vendor_id")
	private Vendor vendor;
	@Lob
	private byte[] imageData;
	private String imageName;
	private String imageType;

	@JsonCreator
	public Product(@JsonProperty("productName") String productName,
				   @JsonProperty("description") String description,
				   @JsonProperty("category") String category,
				   @JsonProperty("subCategory") String subCategory,
				   @JsonProperty("price") double price,
				   @JsonProperty("stock") int stock) {
		this.productName = productName;
		this.description = description;
		this.category = category;
		this.subCategory = subCategory;
		this.price = price;
		this.stock = stock;
	}
}
