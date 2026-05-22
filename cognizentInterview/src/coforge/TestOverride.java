package coforge;

public class TestOverride {
	public static void main(String args[]) {
		Parent p = new Child();
		p.show();
		
	}
	

}

class Parent {
	void show() {
		System.out.println("Parent call");
	}
}

class Child extends Parent {
	
	
	void show() {
		System.out.println("Child call");
	}
}
