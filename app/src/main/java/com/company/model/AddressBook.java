package com.company.model;
import java.util.ArrayList;
import com.company.model.Person;

public class AddressBook{
	private String title;
	private ArrayList<Person> people;
	
	public AddressBook(){
		this.title = "My Address Book";
	}
	
	public AddressBook(String title){
		this.title = title;
	}
	
	public String getTitle(){return title;}
	
	public void setTitle(String title){this.title = title;}
	
	public ArrayList<Person> getPeople(){return people;}
	
	
	public void addPerson(Person p){
		this.people.add(p);
	}
	
	 public Person getPerson(int id){
		for(Person p : this.people){
			if(p.getId() == id){
				return p;
			}
		}
		return new Person();
	}
	
	public void deletePerson(int id){
		for(Person p : this.people){
			if(p.getId() == id){
				this.people.remove(p);
			}
		}
	}
	
	public String toString(){
		String str = "Title: " + getTitle();
		for(Person p : this.people){
			str += " " + p.toString();
		}
		return str;
	}
}
