package com.springcore.springcore.collections;

public class Manager {
	
	private String managerName;

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Manager(String managerName) {
		super();
		this.managerName = managerName;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager [managerName=" + managerName + "]";
	}

	
	

}
