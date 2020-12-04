package com.zooapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory .getSessionFactory();
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		
		
		Category category1 = new Category("cold blooded");
		Category category2 = new Category("warm blooded");
		
		Animal animal1 = new Animal("fish", 15);
		Cage cage1 = new Cage(1, "A1", animal1);
		
		
		Animal animal2 = new Animal("birds", 10);
		Cage cage2 = new Cage(2, "A2", animal2);
		
		Animal animal3 = new Animal("mamals", 8);
		Cage cage3 = new Cage(3, "A3", animal3);
		
		Animal animal4 = new Animal("amphibians", 12);
		Cage cage4 = new Cage(4, "A4", animal4);
		
		List<Animal> animalSet1 = Arrays.asList(animal1, animal2);
		List<Animal> animalSet2 = Arrays.asList(animal3, animal4);
		

		FoodItem item1 = new FoodItem("algae", 10);
		FoodItem item2 = new FoodItem("plants", 15);
		FoodItem item3 = new FoodItem("leaves", 20);
		FoodItem item4 = new FoodItem("fruits", 12);
		
		List<FoodItem> foodItem1 = Arrays.asList(item1, item2);
		List<FoodItem> foodItem2 = Arrays.asList(item3, item4);
		
		Supplier supplier1 = new Supplier("John", "678954328", "delhi");
		Supplier supplier2 = new Supplier("doe", "789654310", "noida");
		Supplier supplier3 = new Supplier("rose", "6554321378", "banglore");
		Supplier supplier4 = new Supplier("lily", "7643432191", "andhra");
		
		item1.setSupplier(supplier1);
		item1.setSupplier(supplier2);
		
		item2.setSupplier(supplier2);
		item2.setSupplier(supplier3);
		
		item3.setSupplier(supplier3);
		item3.setSupplier(supplier4);
		
		item4.setSupplier(supplier4);
		item4.setSupplier(supplier1);
		
		animal1.setFoodItems(foodItem1);

		animal2.setFoodItems(foodItem1);
		
		animal3.setFoodItems(foodItem2);
		
		animal4.setFoodItems(foodItem2);
		
		cage1.setAnimal(animal1);
		animal1.setCage(cage1);
		animal1.setCategory(category1);
		
		cage2.setAnimal(animal2);
		animal2.setCage(cage2);
		animal2.setCategory(category1);
		
		cage3.setAnimal(animal3);
		animal3.setCage(cage3);
		animal3.setCategory(category2);
		
		cage4.setAnimal(animal4);
		animal4.setCage(cage4);
		animal4.setCategory(category2);
		
		
		InHouseVet inHouse = new InHouseVet("danny", "BVSc", 10000);
		ExternalVet external = new ExternalVet("rustom", "DVM", "USA", 500);
		
		
		session.save(animal1);
		session.save(cage1);
		
		session.save(animal2);
		session.save(cage2);
		
		session.save(animal3);
		session.save(cage3);
		
		session.save(animal4);
		session.save(cage4);
		
		session.save(inHouse);
		session.save(external);
		
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
	}

}
