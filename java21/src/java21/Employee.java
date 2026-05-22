package java21;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private String dep;
	
	public Employee(int id, String name, String dep) {
		this.id = id;
		this.name = name;
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dep=" + dep + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dep, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dep, other.dep) && id == other.id && Objects.equals(name, other.name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
	

}
