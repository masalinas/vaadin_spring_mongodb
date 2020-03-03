package com.thingtrack.poc.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Products")
public class Product {
	private String name;
    private Float price;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
