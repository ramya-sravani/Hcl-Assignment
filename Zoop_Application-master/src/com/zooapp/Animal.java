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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ANIMAL")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ANIMAL_ID")
	private int animalId;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="TOTAL_NO")
	private long totalNo;
	
	@OneToOne(mappedBy = "animal")
	private Cage cage;
	
	@JoinColumn(name = "CATEGORY_ID")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Category category;
	
	@JoinTable(name = "ANIMAL_FOOD_ITEM", joinColumns = @JoinColumn(name = "ANIMAL_ID"), inverseJoinColumns = @JoinColumn(name = "FOOD_ITEM_ID"))
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<FoodItem> foodItems = new ArrayList<FoodItem>();

	public Animal() {
	}

	public Animal(String type, long totalNo) {
		this.type = type;
		this.totalNo = totalNo;
	}

	public Animal(String type, long totalNo, Cage cage, Category category, List<FoodItem> foodItems) {
		super();
		this.type = type;
		this.totalNo = totalNo;
		this.cage = cage;
		this.category = category;
		this.foodItems = foodItems;
	}

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getTotalNo() {
		return totalNo;
	}

	public void setTotalNo(long totalNo) {
		this.totalNo = totalNo;
	}

	public Cage getCage() {
		return cage;
	}

	public void setCage(Cage cage) {
		this.cage = cage;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<FoodItem> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [animalId=");
		builder.append(animalId);
		builder.append(", type=");
		builder.append(type);
		builder.append(", totalNo=");
		builder.append(totalNo);
		builder.append(", cage=");
		builder.append(cage);
		builder.append(", category=");
		builder.append(category);
		builder.append(", foodItems=");
		builder.append(foodItems);
		builder.append("]");
		return builder.toString();
	}

}

