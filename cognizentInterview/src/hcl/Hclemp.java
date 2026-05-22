package hcl;

public class Hclemp {
	String name;
	double salary;
	String org;
	
	Hclemp(String name, double salary, String org){
		this.name	=	name;
		this.salary	=	salary;
		this.org	=	org;
	}
	
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name	= name;
	}
	
	public void setSalary(double salary) {
		this.salary	=	salary;
	}
	
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	
}
