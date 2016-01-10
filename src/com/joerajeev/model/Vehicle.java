package com.joerajeev.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the vehicle database table.
 * 
 */
@Entity
@NamedQuery(name="Vehicle.findAll", query="SELECT v FROM Vehicle v")
public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String reg;

	private String colour;

	private String make;

	private int milage;

	private String model;

	private int year;

	//bi-directional many-to-one association to Advert
	@OneToMany(mappedBy="vehicle")
	private List<Advert> adverts;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="owner")
	private User user;

	public Vehicle() {
	}

	public String getReg() {
		return this.reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getMilage() {
		return this.milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Advert> getAdverts() {
		return this.adverts;
	}

	public void setAdverts(List<Advert> adverts) {
		this.adverts = adverts;
	}

	public Advert addAdvert(Advert advert) {
		getAdverts().add(advert);
		advert.setVehicle(this);

		return advert;
	}

	public Advert removeAdvert(Advert advert) {
		getAdverts().remove(advert);
		advert.setVehicle(null);

		return advert;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}