package com.zooapp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FOOD_ITEM")
public class FoodItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FOOD_ITEM_ID")
	private int FoodItemId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "QUANTITY")
	private long quantity;
	
	@ManyToMany(mappedBy = "foodItems")
	private List<Animal> animals = new ArrayList<Animal>();

	@JoinColumn(name = "SUPPLIER_ID")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Supplier supplier;
	
	
	
	public FoodItem(String name, long quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public FoodItem() {
	}


	public int getFoodItemId() {
		return FoodItemId;
	}
	

	public void setFoodItemId(int foodItemId) {
		FoodItemId = foodItemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public List<Animal> getAnimal() {
		return animals;
	}

	public void setAnimal(List<Animal> animals) {
		this.animals = animals;
	}

	
	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodItem [FoodItemId=");
		builder.append(FoodItemId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", animal=");
		builder.append(animals);
		builder.append("]");
		return builder.toString();
	}
}

