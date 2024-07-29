package com.sharath.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PowerBankDto")
@NamedQuery(name="readAll", query="select r from PowerBankDto r")
@NamedQuery(name="readByName", query="select r from PowerBankDto r where r.name=:name")
@NamedQuery(name="readById", query="select r from PowerBankDto r where r.id=:id")
@NamedQuery(name="readByNameAndMah", query="select r from PowerBankDto r where r.name=:name and r.mah=:mah")
@NamedQuery(name="updatePriceByNameAndMah", query="update PowerBankDto r set r.price=:price where r.name=:name and r.mah=:mah")
@NamedQuery(name="deleteByNamePriceAndMah", query="delete from PowerBankDto r where r.name=:name and r.price=:price and r.mah=:mah")


public class PowerBankDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	private String  mah;

	private String materialType;

	private String price;

	public PowerBankDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PowerBankDto(String name, String mah, String materialType, String price) {
		super();
		this.name = name;
		this.mah = mah;
		this.materialType = materialType;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMah() {
		return mah;
	}

	public void setMah(String mah) {
		this.mah = mah;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PowerBankDto [id=" + id + ", name=" + name + ", mah=" + mah + ", materialType=" + materialType
				+ ", price=" + price + "]";
	}
	

}
