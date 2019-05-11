package com.company;
import java.util.ArrayList;
import com.company.model.Address;
import com.company.model.Date;
import com.company.model.Person;
import com.company.model.AddressBook;

public class Main {

   public static void main(String[] args) {
   AddressBook addressBook = new AddressBook("My friends");
   
   Date birthday1 = new Date(2, 5, 2018);
   Address address1 = new Address(50, "Rua das Couves", "1111-111", "Porto", "Portugal");
   Person p1 = new Person(1, "Joaquim da Ponte", address1, birthday1);
   
   addressBook.addPerson(p1);
   
   Date birthday2 = new Date(2, 10, 2010);
   Address address2 = new Address(30, "Rua  das Ervas", "4444-555", "Porto", "Portugal");
   Person p2 = new Person(2, "Maria da Ponte", address2, birthday2);
   
   addressBook.addPerson(p2);
   
   System.out.println(addressBook.toString);
   
   }
   
   
   
   
   
   
   /*Date birthday = new Date(2, 5, 2018);
   Address address =  new Address(50, "Rua das Couves", "1111-111", "Porto", "Portugal");
   Person p = new Person(1, "Joaquim da Ponte", address, birthday);
   System.out.println(p.toString());
}*/

   /*   
   Date d1 = new Date(); 
   d1.setDay(2);
   d1.setMonth(5);
   d1.setYear(2012);
   System.out.println(d1.toString());
   
   Date d2 = new Date(2, 5, 2012);
   System.out.println(d2.toString());   
  }*/
   
   /*
   Address a1 = new Address();
   a1.setNumber(50);
   a1.setStreetName("Rua das Couves");
   a1.setZipCode("1111-111");
   a1.setCity("Porto");
   a1.setCountry("Portugal");
   System.out.println(a1.toString());
   
   Address a2 = new Address(30, "Rua dos Cravos", "2222", "Porto", "Portugal");
   System.out.println(a2.toString());
    }*/
}







