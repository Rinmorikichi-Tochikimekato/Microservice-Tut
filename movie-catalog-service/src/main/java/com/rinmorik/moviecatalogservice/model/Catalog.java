package com.rinmorik.moviecatalogservice.model;

public class Catalog {
	private String name;
	private String desc;
	private int rating;
	
	public Catalog() {
		
	}
	
	@Override
	public String toString() {
		return "Catalog [name=" + name + ", desc=" + desc + ", rating=" + rating + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Catalog(String name, String desc, int rating) {
		super();
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	
	

}
