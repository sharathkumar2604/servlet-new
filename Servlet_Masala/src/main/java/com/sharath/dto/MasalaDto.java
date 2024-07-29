package com.sharath.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "masala")
@NamedQuery(name="readAll",query="select s from MasalaDto s")
@NamedQuery(name="readByQty",query="select s from MasalaDto s where s.qty=:qty")
@NamedQuery(name="readById",query="select s from MasalaDto s where s.id=:id")

@NamedQuery(name="readByPrice",query="select s from MasalaDto s where s.price=:price")
@NamedQuery(name="updateByPrice",query="update MasalaDto s set s.price=:price where s.brand=:brand and s.id=:id")

@NamedQuery(name="deleted",query="delete from MasalaDto s where s.price=:price and s.brand=:brand and s.id=:id")

public class MasalaDto {

	@Id
	private int id;

	private String brand;

	private String type;

	private int qty;

	private int price;

	public MasalaDto() {

	}

	public MasalaDto(int id,String brand, String type, int qty, int price) {
		this.id=id;
		this.brand = brand;
		this.type = type;
		this.qty = qty;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public int getQty() {
		return qty;
	}

	public int getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MasalaDto [id=" + id + ", brand=" + brand + ", type=" + type + ", qty=" + qty + ", price=" + price
				+ "]";
	}

}
