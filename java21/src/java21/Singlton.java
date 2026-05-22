package java21;

public class Singlton {
	
	private static final Singlton instance = new Singlton();
	
	private static Singlton sinstance;
	
	private Singlton() {
		
	}
	
	public static Singlton getInstance() {
		return instance;
	}
	
	public static synchronized Singlton getSinstance() {
		if(sinstance == null) {
			sinstance = new Singlton();
		}
		return sinstance;
	}

}
