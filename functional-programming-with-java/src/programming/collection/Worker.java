package programming.collection;

public class Worker {
	
	private String name;
	private String dep;
	private int sal;

	public Worker(String name, String dep, int sal) {
		this.name = name;
		this.dep = dep;
		this.sal = sal;
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", dep=" + dep + ", sal=" + sal + "]";
	}
	
	

}
