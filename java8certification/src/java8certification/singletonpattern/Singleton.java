package java8certification.singletonpattern;

public class Singleton {
	/*
	private static Singleton instance;
	
	private Singleton() {
		System.out.println("Instance Created");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			Singleton instance = new Singleton(); 
		}
		return instance;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	private static Singleton instance;
	
	private void Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
