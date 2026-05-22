package cognizentInterview;

public class Singltonclass {
	private static final Singltonclass instance = new Singltonclass();
	
	private Singltonclass() {}
	
	public static Singltonclass getInstance1() {
		return instance;
	}
	
	//synchronized
	public static synchronized Singltonclass getInstance() {
		
		return instance;
	}

}
