package com.interface_default;

interface Addressable {
	
	String getStreet();
	String getCity();
	
	default String getFullAddress(){
		return getStreet() + " : " + getCity(); 
	}

}

class Letter implements Addressable {
	
	private String street;
	private String city;
	
	public Letter(String street, String city) {
		this.street = street;
	    this.city = city;
	}
	
	@Override
	public String getCity() {
		
		return city;
	}
	@Override
	public String getStreet() {
	
		return street;
	}
	
}

public class InterfaceDefault {
	
	public static void main(String[] args) {
		
		Letter letter = new Letter("402 metroplex", "edison");
		System.out.println("Default Address____________________"+letter.getFullAddress());
	}
}
