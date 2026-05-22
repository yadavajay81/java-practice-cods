
public class SingltonThreadSafe {
	private static volatile SingltonThreadSafe instance;
	
	private SingltonThreadSafe() {}
	
	public static SingltonThreadSafe getInstance() {
		if(instance == null) {
			synchronized(SingltonThreadSafe.class) {
				if(instance == null) {
					instance = new SingltonThreadSafe();
				}
			}
		}
		return instance;
		
	}

}
