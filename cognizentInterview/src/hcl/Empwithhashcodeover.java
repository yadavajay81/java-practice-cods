package hcl;

import java.util.Objects;

public class Empwithhashcodeover {
	
	int id;
	String name;
	
	Empwithhashcodeover(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empwithhashcodeover other = (Empwithhashcodeover) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Empwithhashcodeover [id=" + id + ", name=" + name + "]";
	}
	
	

}
