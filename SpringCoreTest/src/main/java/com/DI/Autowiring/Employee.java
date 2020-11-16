package com.DI.Autowiring;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}

	public Employee() {
		super();
	}

	public Employee(Address address) {
		System.out.println("Inside Constructor");
		
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
