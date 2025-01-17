package com.example.spring.mongo.embedded.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Document(collection="order_DB")
public class User {
	
	@Id
	private int id;
	private String name;
	private String gender;
	private List<Product> products;
	private Address address;
	
	

}
