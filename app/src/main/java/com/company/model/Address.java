package com.company.model;

public class Address {
   private int number;
   private String streetName;
   private String zipCode;
   private String city;
   private String country;
   
   public Address(){
     this.setNumber(0);  
     this.setStreetName("Not specified");
     this.setZipCode("Not specified");
     this.setCity("Not specified");
     this.setCountry("Not specified");
   }
   
   public Address(int number, String streetName, String zipCode, String city, String country){ 
      this.setNumber(number);
      this.setStreetName(streetName);
      this.setZipCode(zipCode);
      this.setCity(city);
      this.setCountry(country);
  }
  
  public int getNumber(){return number;}
  
  public void setNumber(int number){this.number = number;}
  
  public String getStreetName(){return streetName;}
  
  public void setStreetName(String streetName){this.streetName = streetName;}
  
  public String getZipCode(){return zipCode;}
  
  public void setZipCode(String zipCode){this.zipCode = zipCode;}
  
  public String getCity(){return city;}
  
  public void setCity(String city){this.city = city;}
  
  public String getCountry(){return country;}
  
  public void setCountry(String country){this.country = country;}
  
  public String toString(){
    String str = Integer.toString(this.getNumber()) + " " +  this.getStreetName() + " " + this.getZipCode() + " " + this.getCity() + " " + this.getCountry();
    return str;
  }
}
