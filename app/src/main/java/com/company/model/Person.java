package com.company.model;

public  class Person{
	private int id;
	private String name;
	private Address address;
	private Date birthday;
	
	public Person(){
		this.id = 0;
		this.name = "Not assigned";
		this.address = null;
		this.birthday = null;
	}
	
	public Person(int id, String name, Address address, Date birthday){
		this.id = id;
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}
	
	public int getId(){return id;}
	
	public void setId(int id){this.id = id;}
	
	public String getName(){return name;}
	
	public void setName(String name){this.name = name;}
	
	public Address getAddress(){return address;}
	
	public void setAddress(Address address){this.address = address;}
	
	public Date getBirthday(){return birthday;}
	
	public void setBirthday(Date birthday){this.birthday = birthday;}
	
	public String toString(){
		String str = "Id: " + Integer.toString(getId()) + "\nName: " + getName() + "\nAddress: " + getAddress().toString() + "\nBirthday: " + getBirthday().toString();
		return str;
	}
}
