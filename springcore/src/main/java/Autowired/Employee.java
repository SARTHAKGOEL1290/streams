package Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("Adr1")   // this is used to specify particular bean to be autowired
	private Address Adr;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAdr() {
		return Adr;
	}

	public void setAdr(Address adr) {
		Adr = adr;
	}

	public Employee(Address adr) {
		super();
		Adr = adr;
	}

	@Override
	public String toString() {
		return "Employee [Adr=" + Adr + "]";
	}

}
