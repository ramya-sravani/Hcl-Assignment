package com.zooapp;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CAGE")
public class Cage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAGE_ID")
	private int cageId;
	
	@Column(name = "CAGE_NO")
	private int cageNo;
	
	@Column(name = "LOCATION")
	private String location;
	
	@JoinColumn(name = "ANIMAL_ID")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Animal animal;

	public Cage(int cageNo, String location, Animal animal) {
		super();
		this.cageNo = cageNo;
		this.location = location;
		this.animal = animal;
	}

	public Cage() {
		super();
	}

	public int getCageId() {
		return cageId;
	}

	public void setCageId(int cageId) {
		this.cageId = cageId;
	}

	public int getCageNo() {
		return cageNo;
	}

	public void setCageNo(int cageNo) {
		this.cageNo = cageNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cage [cageId=");
		builder.append(cageId);
		builder.append(", cageNo=");
		builder.append(cageNo);
		builder.append(", location=");
		builder.append(location);
		builder.append("]");
		return builder.toString();
	}
	
}

